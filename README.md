# ☕ Maratona Java Virado no Jiraya — DevDojo

> Repositório de estudos do curso gratuito **Maratona Java Virado no Jiraya**, disponível no canal [DevDojo](https://www.youtube.com/@DevDojoBr) no YouTube.

---

## 📌 Sobre o Curso

O **Maratona Java Virado no Jiraya** é considerado o curso de Java em português mais completo e gratuito da internet. São mais de **280 aulas** cobrindo desde os fundamentos até tópicos avançados como Threads, Concorrência, Streams, JDBC e Design Patterns.

- 🎥 **Playlist PT-BR:** [Assistir no YouTube](https://www.youtube.com/watch?v=VKjFuX91G5Q&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW)
- 🌐 **Playlist EN:** [Java One For All](https://www.youtube.com/watch?v=GXt46-Npz0Y&list=PL0Un1HNdB4jGKw5szJrQETqJTlZKyKReu)
- 👨‍💻 **Criado por:** [William Suane](https://www.linkedin.com/in/williamsuane/)
- 📁 **Repositório oficial:** [devdojobr/maratona-java-virado-no-jiraya](https://github.com/devdojobr/maratona-java-virado-no-jiraya)

---

## 🛠️ Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

---

## 📚 Conteúdo do Curso

### 🔰 Introdução
- Configuração do ambiente (JDK, IntelliJ, variáveis de ambiente)
- Como Java funciona (JVM, compilação, execução)
- Organização do código em pacotes

### 📦 Fundamentos
- Tipos primitivos e casting
- Operadores (aritméticos, relacionais, lógicos, atribuição)
- Estruturas condicionais: `if/else`, operador ternário, `switch`
- Estruturas de repetição: `while`, `do while`, `for`, `break`, `continue`
- Arrays e Arrays Multidimensionais

### 🧩 Orientação a Objetos
- Classes, objetos e referências
- Métodos, parâmetros, retorno e varargs
- Encapsulamento (`private`, getters e setters)
- Sobrecarga de métodos e construtores
- Modificadores `static` e `final`
- Herança, `super` e `protected`
- Classes abstratas e Interfaces
- Polimorfismo, cast e `instanceof`
- Enumerações (`enum`)
- Associações (unidirecional, bidirecional)

### ⚠️ Exceções
- `Error`, `RuntimeException`, `Exception`
- Lançando exceções checked e unchecked
- Bloco `finally`, multi-catch, try-with-resources
- Exceções customizadas e regras de sobrescrita

### 🔧 Classes Utilitárias
- Wrappers, Strings e StringBuilder
- Date, Calendar, DateFormat, LocalDate/Time/DateTime
- Instant, Duration, Period, ChronoUnit, TemporalAdjusters
- ZonedDateTime, DateTimeFormatter
- Internacionalização com `Locale`
- Regex (Pattern, Matcher)
- Scanner, IO (File, FileWriter/Reader, BufferedWriter/Reader)
- NIO (Path, Files, FileAttributes, DirectoryStream, PathMatcher)
- Serialização

### 📋 Coleções
- `equals` e `hashCode`
- Complexidade Big-O
- `List`, `Set` (`HashSet`, `TreeSet`), `Map` (`HashMap`, `LinkedHashMap`, `TreeMap`)
- `Queue` e `PriorityQueue`
- Sorting (`Comparable`, `Comparator`), Binary Search, Iterator

### 🔬 Generics
- Wildcards, classes e métodos genéricos

### 🏛️ Classes Internas
- Aninhadas, locais, anônimas e estáticas

### λ Programação Funcional
- Parametrizando comportamentos
- Lambdas: `Predicate`, `Consumer`, `Function`
- Method References (estáticos, não estáticos, construtor)
- `Optional`
- Streams: `filter`, `map`, `flatMap`, `reduce`, Collectors, Parallel Streams

### 🧵 Threads e Concorrência
- Estados das threads, prioridade, `sleep`, `yield`, `join`
- Sincronismo, `deadlock`, `wait`/`notify`/`notifyAll`
- `AtomicInteger`, `ReentrantLock`, `Conditions`, `ReentrantReadWriteLock`
- `CopyOnWriteArrayList`, `ArrayBlockingQueue`, `LinkedTransferQueue`
- Executors, Thread Pools, `ScheduledExecutorService`
- `Callable`, `Future`, `CompletableFuture`

### 🏗️ Design Patterns
- Builder, Factory, Singleton (Eager, Lazy, Enum)
- Data Transfer Object (DTO)

### 🗄️ JDBC
- Configurando Docker e MySQL
- `Statement`, `PreparedStatement`, `CallableStatement`
- `ResultSet`, `ResultSetMetaData`, `DatabaseMetaData`
- `JdbcRowSet`, `CachedRowSet`
- Transações e CRUD completo

### 🧪 Testes
- Testes unitários com JUnit

### 🆕 Recursos Modernos do Java
- Record Classes
- Pattern Matching para `instanceof`

---

## 🚀 Como Executar

**Pré-requisitos:**
- JDK 17+ instalado
- IntelliJ IDEA (Community Edition)

**Clone o repositório:**
```bash
git clone https://github.com/guiguilima796-eng/maratonaJavaViradoNoJiraya.git
cd maratonaJavaViradoNoJiraya
```

Abra o projeto no IntelliJ IDEA e execute qualquer classe com método `main`.

---

## 📂 Estrutura do Projeto
src/
├── academy/
│   ├── devdojo/
│   │   ├── maratonaJavaViradoNoJiraya/
│   │   │   ├── introduction/
│   │   │   ├── fundamentals/
│   │   │   ├── oop/
│   │   │   ├── exceptions/
│   │   │   ├── utilities/
│   │   │   ├── collections/
│   │   │   ├── generics/
│   │   │   ├── innerClasses/
│   │   │   ├── functional/
│   │   │   ├── threads/
│   │   │   ├── designPatterns/
│   │   │   ├── jdbc/
│   │   │   └── tests/
│   │   └── ...
│   └── ...
---

## 👤 Autor

**Guilherme** — estudante em desenvolvimento, seguindo a trilha do DevDojo.

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/guiguilima796-eng)

---

## ⭐ Agradecimentos

Agradecimento especial ao **William Suane** e ao **DevDojo** por disponibilizarem um curso de tamanha qualidade de forma totalmente gratuita. Se este conteúdo te ajudou, considera deixar uma ⭐ no repositório e se inscrever no canal!

---

<p align="center">
  Feito com ☕ e muito Java
</p>