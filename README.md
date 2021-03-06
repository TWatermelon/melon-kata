# melon-kata | Let's fight

### TDD Practice
* [TDD Practice 1](docs/TDD1.md)
* [TDD Practice 2](docs/TDD2.md)

### Project Board
[TWatermelon Trello](https://trello.com/b/k5vWnDWD/melon-kata)

### Jenkins
[melon-kata-new](http://jenkins.waterstrong.me:8080/view/melon-kata-new/)

### Travis CI
[melon-kata builds](https://travis-ci.org/TWatermelon/melon-kata/builds)

### How to Start

#### Generate IntelliJ IDEA project
`./gradlew cleanIdea idea`

Open the `melon-kata.ipr` using IntelliJ

#### Run clean and build tasks
`./gradlew clean build`

This will run checkstyle, unit test and code coverage check

### Git提交规范：

[卡号][提交作者&Pair作者] - comment here

Note: [提交作者]和comment之间需要有 空格+minus+空格，comment内容不要出现minus。

**Example:** `[M001][Shuiqiang&Waterstrong] - add the order domain object`


### Java代码规范：

- Java代码必须删去没有引用到的包，Import语句为灰色即是可删去。
- 类文件开始处不要出现 "/* xxx create xxx */" 这样自动生成的注释。
- 还有其他规范Checkstyle也会覆盖到
