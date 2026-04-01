# Hello World Android

A minimal Android Hello World app built with Kotlin and XML layouts.

## Prerequisites

- Android device or emulator with API 24+ — to run the app
- [ADB](https://developer.android.com/tools/adb) — to install the APK on a device

## Build

### Option 1 — Docker (no local SDK required)

Requires [Docker Desktop](https://www.docker.com/products/docker-desktop/).

```bash
docker compose up --build
```

Subsequent builds skip the image rebuild and run in ~20s.

### Option 2 — Local

Requires [JDK 17](https://adoptium.net/) and [Android Studio](https://developer.android.com/studio) (or the Android SDK command-line tools) with `ANDROID_HOME` set.

**macOS / Linux:**
```bash
./gradlew assembleDebug
```

**Windows:**
```bat
gradlew.bat assembleDebug
```

The APK is output to:

```
app/build/outputs/apk/debug/app-debug.apk
```

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
