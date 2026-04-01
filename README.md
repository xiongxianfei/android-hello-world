# Hello World Android

A minimal Android Hello World app built with Kotlin and XML layouts.

## Prerequisites

- [Docker Desktop](https://www.docker.com/products/docker-desktop/) — to build the APK
- Android device or emulator with API 24+ — to run the app
- [ADB](https://developer.android.com/tools/adb) — to install the APK on a device

## Build

```bash
docker compose up --build
```

The APK is output to:

```
app/build/outputs/apk/debug/app-debug.apk
```

Subsequent builds (no code changes) skip the Docker image rebuild and run in ~20s.

## Install

Connect an Android device with USB debugging enabled, then:

```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

## Tech Stack

| Component | Version |
|---|---|
| Language | Kotlin 1.9.24 |
| Android Gradle Plugin | 8.3.2 |
| Gradle | 8.7 |
| compileSdk / targetSdk | 34 |
| minSdk | 24 |

## License

[MIT](LICENSE)
