# java9
Java 9 Experiments
Switch Java version between 8 and 8 

Run this command to check avaliable version installed on your machine

```
/$: /usr/libexec/java_home -V

Matching Java Virtual Machines (2):
    9.0.4, x86_64:	"Java SE 9.0.4"	/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home
    1.8.0_144, x86_64:	"Java SE 8"	/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home

/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home
```

To set Java 8 version in your machine

```
$: export JAVA_HOME=`/usr/libexec/java_home -v 1.8.0_144, x86_64`
```

To set Java 9 version in your machine

```
$: export JAVA_HOME=`/usr/libexec/java_home -v 9.0.4, x86_64`
```

Similary for any other java version.

Java 9 Docs
https://docs.oracle.com/javase/9/index.html

REf:

https://stackoverflow.com/questions/21964709/how-to-set-or-change-the-default-java-jdk-version-on-os-x
