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

____________________________________________________________________________________________________
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


____________________________________________________________________________________________________


# Streams API - Filter
- o filter é o elemento mais usado do streams api. Ele serve para filtrar elementos de uma coleção, conteudo que estudamos anteriormente. 
- Ele vai "Substituir o for" Antes quando iriamos imprimir os elementos da lista. não existia nenhum controle, o filtro não estava lá. era mais ou menos assim.
```java
for (Carro carroImprimir : carros) {
        System.out.println(carroImprimir);
    }
```
- O resultado seria a lista completa. 
### COMO É A ESTRUTURA DO FILTER?


____________________________________________________________________________________________________
# map() — Streams API Java

O `map()` é uma operação intermediária da Streams API usada para
TRANSFORMAR elementos.

Ele pega cada item do Stream e converte para outro valor.

---

# Sintaxe

```java
stream.map(x -> transformação)
```

---

# Exemplo básico

```java
List<String> nomes = List.of("joao", "maria", "ana");

List<String> maiusculos = nomes.stream()
        .map(nome -> nome.toUpperCase())
        .toList();

System.out.println(maiusculos);
```

## Saída

```java
[JOAO, MARIA, ANA]
```

---

# O que aconteceu?

O `map()` pegou cada elemento:

```java
joao
maria
ana
```

E transformou em:

```java
JOAO
MARIA
ANA
```

---

# Visualmente

```text
Stream original
["joao", "maria", "ana"]

↓

map(nome -> nome.toUpperCase())

↓

Novo Stream
["JOAO", "MARIA", "ANA"]
```

---

# Outro exemplo — dobrando números

```java
List<Integer> numeros = List.of(1, 2, 3, 4);

List<Integer> dobro = numeros.stream()
        .map(n -> n * 2)
        .toList();

System.out.println(dobro);
```

## Saída

```java
[2, 4, 6, 8]
```

---

# Transformando tipos

O `map()` também pode transformar um tipo em outro.

---

## Exemplo:
String → Integer

```java
List<String> numeros = List.of("1", "2", "3");

List<Integer> inteiros = numeros.stream()
        .map(n -> Integer.parseInt(n))
        .toList();

System.out.println(inteiros);
```

## Saída

```java
[1, 2, 3]
```

---

# Exemplo MUITO usado no backend

Imagine uma classe:

```java
class Usuario {
    String nome;
    int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
}
```

---

## Pegando apenas nomes

```java
List<Usuario> usuarios = List.of(
        new Usuario("João", 20),
        new Usuario("Maria", 25),
        new Usuario("Ana", 30)
);

List<String> nomes = usuarios.stream()
        .map(usuario -> usuario.getNome())
        .toList();

System.out.println(nomes);
```

## Saída

```java
[João, Maria, Ana]
```

---

# Resumindo

O `map()` serve para:

- transformar dados
- modificar valores
- converter tipos
- extrair propriedades de objetos

---

# Diferença entre map() e filter()

## filter()

FILTRA elementos.

```java
.filter(n -> n > 10)
```

---

## map()

TRANSFORMA elementos.

```java
.map(n -> n * 2)
```

---

# Exemplo combinando os dois

```java
List<Integer> numeros = List.of(5, 10, 15, 20);

List<Integer> resultado = numeros.stream()
        .filter(n -> n > 10)
        .map(n -> n * 2)
        .toList();

System.out.println(resultado);
```

## Saída

```java
[30, 40]
```

---

# Fluxo mental

```text
Lista original
[5, 10, 15, 20]

↓

filter(n > 10)
[15, 20]

↓

map(n * 2)
[30, 40]
```

---

# Operações comuns com map()

| Operação | Exemplo |
|---|---|
| Maiúsculo | `.map(String::toUpperCase)` |
| Minúsculo | `.map(String::toLowerCase)` |
| Dobrar número | `.map(n -> n * 2)` |
| Extrair nome | `.map(Usuario::getNome)` |
| Converter String para Integer | `.map(Integer::parseInt)` |

---

# Dica importante

O `map()` NÃO altera a lista original.

Ele cria um NOVO Stream transformado.

---

# Forma moderna (Method Reference)

Ao invés disso:

```java
.map(nome -> nome.toUpperCase())
```

Você pode usar:

```java
.map(String::toUpperCase)
```

Fica mais limpo e profissional.

---

# Exemplo final completo

```java
List<String> nomes = List.of("joao", "maria", "ana");

List<String> resultado = nomes.stream()
        .filter(nome -> nome.startsWith("j"))
        .map(String::toUpperCase)
        .toList();

System.out.println(resultado);
```

## Saída

```java
[JOAO]
```

---

# Conclusão

O `map()` é uma das funções MAIS IMPORTANTES da Streams API.

Você vai usar MUITO em:
- Spring Boot
- APIs REST
- transformação de DTO
- banco de dados
- listas de objetos
- backend em geral