# Official Parties API for ranked.network!

## Maven
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

<dependency>
    <groupId>com.github.RankedNetwork</groupId>
    <artifactId>RankedParties-API</artifactId>
    <version>VERSION</version>
</dependency>
```
## Gradle
```groovy

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.RankedNetwork:RankedParties-API:VERSION'
}

```