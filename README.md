## Spring Shell

### Prerequisite
Install GraalVM [(Homebrew Tap for GraalVM)](https://github.com/graalvm/homebrew-tap)

### Compile
```shell
./mvnw -Pnative native:compile -DskipTests=true
```

### Output
| File                         |   Size    |
|------------------------------|:---------:|
| dadjoke                      |    86M    |
| dadjoke-0.0.1-SNAPSHOT.jar   |    27M    |


### Thanks
[Building Command Line Applications in Spring with Spring Shell](https://www.youtube.com/watch?v=8B0IjOIzicU)