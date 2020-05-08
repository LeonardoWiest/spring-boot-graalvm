<a href="http://fvcproductions.com"><img src="https://avatars1.githubusercontent.com/u/45858759?s=200&v=4" title="FVCproductions" alt="FVCproductions"></a>

<!-- [![FVCproductions](https://avatars1.githubusercontent.com/u/4284691?v=3&s=200)](http://fvcproductions.com) -->

# spring-boot-graalvm

[![Actions Status](https://github.com/LeonardoWiest/spring-boot-graalvm/workflows/Github%20CI%20Compiler/badge.svg)](https://github.com/LeonardoWiest/spring-boot-graalvm/actions)

## Menu

- [Instalação](#Instalação)
- [Suporte](#Suporte)
- [Licença](#Licença)


## Instalação

Passos para instalação do GraalVM

### Windows

Faça o download da JDK 8 do GraalVM(Windows) e do .jar da imagem nativa por meio do link:
```https://github.com/graalvm/graalvm-ce-builds/releases```

Em seguida, defina a sua varivavel JAVA_HOME para a instalacao da JDK do GraalVM.Após faça a instalação do jar da imagem nativa, através do comando:

```gu -L install native-image.jar```

Na sequencia, faça clone do repositório `https://github.com/LeonardoWiest/spring-boot-graalvm`, e
execute o PowerShell do Windows como Administrador para que seja feita a instalação das Lib's necessárias para a compilação em imagem nativa, isso através do gerenciador chocolatey, copie e cole o comando abaixo no PowerShell :

Instalação do chocolatey:
``` Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))```

Após, instale o Windows SDK 7.1 e C ++:
```choco install windows-sdk-7.1 kb2519277```

Utilize o comando Call para utilizar o SDK
```call "C:\Program Files\Microsoft SDKs\Windows\v7.1\Bin\SetEnv.cmd"```

Compile o protótipo :
```mvn clean package -Dmaven.test.skip=true -Pgraal```

### Linux e Mac

## Suporte

Joia, qualquer dúvida estamos a disposição :)

- Murilo <a href="muriloftto@gmail.com" target="_blank">`muriloftto@gmail.com`</a>
- Leonardo <a href="leonardowiest@hotmail.com" target="_blank">`leonardowiest@hotmail.com`</a>

## Licença

[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)

- **[MIT license](http://opensource.org/licenses/mit-license.php)**
- Copyright 2020 © <a target="_blank">Spring-boot-GraalVM</a>.
