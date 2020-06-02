# Print Manager - Gerenciador de impressão

> Gerenciador de impressão que, ao tentar gerar mais de uma de impresora, acaba sempre obtendo a mesma instância da classe Printer, graças ao padrão de criação Singleton.

## Objetivo

Demonstrar que este padrão permite que uma classe instancie apenas um único objeto Printer (impressora). Sendo um exemplo simplificado de um gerenciador de impressão real, que deve acionar a mesma impressora para reliziar alguma impressão.

## Antes do Singleton

Método main:
```java
Printer p1 = new Printer();
Printer p2 = new Printer();
Printer p3 = new Printer();
Printer p4 = new Printer();		

System.out.println("Endereço de memória de p1: "+p1);
System.out.println("Endereço de memória de p2: "+p2);
System.out.println("Endereço de memória de p3: "+p3);
System.out.println("Endereço de memória de p4: "+p4);
```

Saída: 
```java
Endereço de memória de p1: modelo.Printer@15db9742
Endereço de memória de p2: modelo.Printer@6d06d69c
Endereço de memória de p3: modelo.Printer@7852e922
Endereço de memória de p4: modelo.Printer@4e25154f
```

Cada tentativa de instanciar uma impressora acabou retornando um endereço de memória diferente, com isto podemos observar que foram criadas quatro instâncias.

## Usando Singleton

Ajustando a classe Printer no padrão Singleton:
```java
public class Printer {

  private static Printer printer;
	
  private Printer() {

  }
	
  public static Printer getInstance() { 
    if(printer == null) {
      printer = new Printer();
    }

    return printer;
  }
}
```

Torna-se o construtor private, cria-se um atributo private e static do tipo da classe, pois será referenciado por um método public e também static chamado getInstance(). Este método analisa se o atributo printer é null. 

Caso seja, irá instanciar a classe Printer e atribuir a printer e então retorna este atributo. Caso printer ja pussua o objeto Printer, o método irá apenas retornar o atributo.

Método main:
```java
Printer p1 = Printer.getInstance();
Printer p2 = Printer.getInstance();
Printer p3 = Printer.getInstance();
Printer p4 = Printer.getInstance();

System.out.println("Endereço de memória de p1: "+p1);
System.out.println("Endereço de memória de p2: "+p2);
System.out.println("Endereço de memória de p3: "+p3);
System.out.println("Endereço de memória de p4: "+p4);
```

Saída:
```java
Endereço de memória de p1: modelo.Printer@15db9742
Endereço de memória de p2: modelo.Printer@15db9742
Endereço de memória de p3: modelo.Printer@15db9742
Endereço de memória de p4: modelo.Printer@15db9742
```

Para as quatro tentativas de instanciar a classe Printer, pode-se observar que o endereço de memória é sempre o mesmo. Isto significa que, uma vez instanciado, o objeto a ser manipulado é sempre o mesmo.

