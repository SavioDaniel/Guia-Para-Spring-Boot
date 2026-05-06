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

lista.add = ("Java");
lista.add = ("HTML");
```
- com esse método é possível colocar um item a sua lista.

```java
lista.add = (index: 1, element: "Phyton");
```
- Assim é possivel determinar a posição que o seu elemento vai ocupar.

```java
lista.addFirst = ("C#");
lista.addLast = ("JavaScript");
```
- Com esses dois comandos é possivel colocar elementos no inico ou no fim.

<span style="color:red;">obs: Essa notação é exclusiva do LinkedList, Por isso ela é tratada como mais rapido na hora de inserir o elemento.</span>

_______________________________________________________________________________________________________________________________________

# REMOVE (int index)
Você diz ao Java: "Remova quem estiver na cadeira número X".

- ArrayList: É mais lento, pois após remover o item, todos os elementos à direita precisam "dar um passo para a esquerda" para não deixar buracos.

- LinkedList: O Java precisa caminhar até o índice (o que é lento), mas a remoção em si é rápida (só desconecta os ponteiros).

```java
Lista.remove(0);
```
- Esse comendo é usado para remover o primeiro comando da lista.


# REMOVE (Object o)
Você diz: "Procure o objeto 'João' e remova-o".

- O Java percorre a lista do início ao fim procurando o item. Se houver dois "João", apenas o primeiro encontrado será removido. Retorna true se encontrou e removeu, ou false se não existia na lista.

```java
lista.remove("Java");
```
- Procura o texto "Java" e remove

# removeAll(Collection c)

Serve para remover de uma vez só todos os itens que estão em outra coleção. É como uma "limpeza por filtro".

- Se você tem uma lista de frutas e uma lista de "frutas estragadas", você usa listaFrutas.removeAll(estragadas).

```java
List<Integer> removerEsses = Arrays.asList(10, 20, 30);
numeros.removeAll(removerEsses);
```
- Tira todos os 10, 20 e 30 da lista de uma vez

# clear() — O Botão de Reset

- ste método esvazia a lista completamente. Ela continua existindo (o objeto não é deletado), mas o seu tamanho (size()) passa a ser 0.
```java
lista.clear(); // A lista agora está vazia: []
```

# Comparativo de Performance (Remoção)

| Método | ArrayList | LinkedList |
|--------|-----------|------------|
| remove(0) (Início) | Lento (move todos) | Muito Rápido |
| remove(index) (Meio) | Lento (move metade) | Lento (tem que achar o nó) |
| remove(ultimo) | Muito Rápido | Muito Rápido |
| clear() | Rápido | Rápido |

_______________________________________________________________________________________________________________________________________

# Set

- De forma resumida, ele serve para armazenar elementos únicos, sem repetição.

- Por exemplo. se eu for fazer um set String. para colocar nome de frutas. e entre elas eu repetir o nome maçã 3 vezes, quando eu printar a tela, o nome maçã so ira aparecer uma unicar vez. Essa é a principal diferença para <span style="color:red"> Liste. </span>

## Diferença de Set para List

- Como eu explique anteriormente, em List, pode repetir as palavras, ja em set não pode acontecer. 
  
# ✅ Quando usar `Set` ou `List`?

## 🔵 Use `List` quando:

| Critério | `List` |
|----------|--------|
| Elementos repetidos | ✅ Pode ter |
| Acesso por posição (índice) | ✅ Sim |
| Ordem de inserção | ✅ Preservada |
| Modificar elementos específicos | ✅ Sim |

## 🟢 Use `Set` quando:

| Critério | `Set` |
|----------|-------|
| Elementos repetidos | ❌ Não querer |
| Apenas saber se existe ou não | ✅ Ideal |
| Operações matemáticas de conjuntos | ✅ Sim |
| Ordem importante | ❌ Não é importante |

---

## 📋 Resumo rápido

| Situação | Escolha |
|----------|---------|
| Sem repetições + teste de existência + operações de conjunto + ordem não importa | `Set` |
| Com repetições + acesso por índice + ordem importante + modificação por posição | `List` |
