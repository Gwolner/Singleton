# Print Manager

> Gerenciador de impressão que, ao tentar gerar mais de uma de impresora, acaba sempre obtendo a mesma instância da classe Impressora, graças ao padrão de criação Singleton.

## Objetivo

Demonstrar que este padrão permite que uma classe instancie apenas um único objeto Impressora. Sendo um exemplo simplificado de um gerenciador de impressão real, que deve acionar a mesma impressora para reliziar alguma impressão.

## Antes do Singleton

Método main:
```java
Impressora p1 = new Impressora();
Impressora p2 = new Impressora();
Impressora p3 = new Impressora();
Impressora p4 = new Impressora();		

System.out.println("Endereço de memória de p1: "+p1);
System.out.println("Endereço de memória de p2: "+p2);
System.out.println("Endereço de memória de p3: "+p3);
System.out.println("Endereço de memória de p4: "+p4);
```

Saída: 
```java
Endereço de memória de p1: modelo.Impressora@15db9742
Endereço de memória de p2: modelo.Impressora@6d06d69c
Endereço de memória de p3: modelo.Impressora@7852e922
Endereço de memória de p4: modelo.Impressora@4e25154f
```

Cada tentativa de instanciar uma Impressora acabou retornando um endereço de memória diferente, com isto podemos observar que foram criadas quatro instâncias.

## Usando Singleton

Classe Impressora no padrão Singleton:
```java
public class Impressora {

  private static Impressora impressora;
	
  private Impressora() {

  }
	
  public static Impressora getInstance() { 
    if(impressora == null) {
      impressora = new Impressora();
    }

    return impressora;
  }
}
```

Torna-se o construtor private, cria-se um atributo private e static do tipo da classe, pois será referenciado por um método public e também static chamado getInstance(). Este método analisa se o atributo impressora é null. 

Caso seja, irá instanciar a classe Impressora e atribuir a impressora e então retorna este atributo. Caso impressora ja pussua o objeto Impressora, o método irá apenas retornar o atributo.

Método main:
```java
Impressora p1 = Impressora.getInstance();
Impressora p2 = Impressora.getInstance();
Impressora p3 = Impressora.getInstance();
Impressora p4 = Impressora.getInstance();

System.out.println("Endereço de memória de p1: "+p1);
System.out.println("Endereço de memória de p2: "+p2);
System.out.println("Endereço de memória de p3: "+p3);
System.out.println("Endereço de memória de p4: "+p4);
```

Saída:
```java
Endereço de memória de p1: modelo.Impressora@15db9742
Endereço de memória de p2: modelo.Impressora@15db9742
Endereço de memória de p3: modelo.Impressora@15db9742
Endereço de memória de p4: modelo.Impressora@15db9742
```

Para as quatro tentativas de instanciar a classe Impressora, pode-se observar que o endereço de memória é sempre o mesmo. Isto significa que, uma vez instanciado, o objeto a ser manipulado é sempre o mesmo.

