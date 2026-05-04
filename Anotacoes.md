# ArrayList vs LinkedList

## Diferença Real vs ArrayList
| Operação | ArrayList | LinkedList |
| :--- | :--- | :--- |
| Acesso por índice | 🔥 Rápido | 🐢 Lento |
| Inserir no meio | 🐢 Lento | ⚡ Rápido |
| Remover no meio | 🐢 Lento | ⚡ Rápido |

## Como criar 
- Para LinkedList fica. 
    List<Integer> lista = new LinkedList<>();

- Para ArrayList fica.
    List<Integer> numb = new ArrayList<>();

## Como determinar o tipo da sua Lista?
    Para fazer isso é simples dentro "List<Integer> numb = new ArrayList<>();" temos o seguinte elemento <>, oq vai dentro dele determina o tepo da sua lista. a baixo temos todos os tipos. 

| Tipo (Wrapper Class) | Tipo Primitivo | Função |
| :--- | :--- | :--- |
| `Integer` | `int` | Armazena números inteiros (ex: 1, 10, -50). |
| `Double` | `double` | Armazena números decimais de alta precisão (ex: 10.5, 3.14). |
| `Float` | `float` | Números decimais de precisão simples (ex: 1.5f). |
| `Long` | `long` | Números inteiros muito grandes (ex: IDs de banco de dados). |
| `Boolean` | `boolean` | Valores lógicos: `true` ou `false`. |
| `Character` | `char` | Armazena um único caractere (ex: 'A', '7'). |
| `String` | (Não tem) | Armazena textos (ex: "Olá mundo"). Já é um objeto por padrão. |
| `Byte` | `byte` | Números inteiros bem pequenos (-128 a 127). |
| `Short` | `short` | Números inteiros curtos. |


## Adição

- para fazer uma adição em ArrayList e LinkedList, a interfa é a mesma, então basta usar as mesmas coisas que funciona. Como se trada da msm interfa eu vou usar apenas uma para explicar todo o processo.
  
```java
ArrayList<String> lista = new ArrayList<>();

lista.add = 
```
