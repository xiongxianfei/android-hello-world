# android-hello-world

[![Build](https://github.com/xiongxianfei/android-hello-world/actions/workflows/build.yml/badge.svg)](https://github.com/xiongxianfei/android-hello-world/actions/workflows/build.yml)

A minimal Android Hello World app built with Kotlin and XML layouts. Displays "Hello World!" centered on screen.

## Overview

| | |
|---|---|
| **Language** | Kotlin 1.9.24 |
| **UI** | XML Layout + ConstraintLayout |
| **Min SDK** | API 24 (Android 7.0) |
| **Target SDK** | API 34 (Android 14) |
| **Build Tool** | Gradle 8.7 + AGP 8.3.2 |
| **License** | MIT |

## Prerequisites

- [Docker Desktop](https://www.docker.com/products/docker-desktop/) — for Docker build
- [Android Studio](https://developer.android.com/studio) — for local build and emulator
- [ADB](https://developer.android.com/tools/adb) — to install the APK on a device

## Build

### Option 1 — Docker (no local SDK required)

```bash
docker compose up --build
```

Subsequent builds skip the image rebuild and run in ~20s.

### Option 2 — Local

Requires JDK 17 and Android Studio with `ANDROID_HOME` set.

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

## Run

### Step 1 — Start an emulator or connect a device

- **Emulator:** Open Android Studio → Tools → Device Manager → Create Virtual Device (Pixel 6, API 34) → press ▶
- **Physical device:** Enable USB Debugging on your phone and connect via USB

### Step 2 — Verify ADB sees the device

```bash
adb devices
```

### Step 3 — Install and launch

```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

The app will appear in the launcher — tap **Hello World** to open it.

## CI/CD

GitHub Actions runs on every push and pull request to `main`:

| Job | Description |
|---|---|
| **Local (Gradle)** | Builds APK directly with Gradle on the runner |
| **Docker** | Builds APK inside a Docker container |

Both jobs upload the APK as a downloadable artifact.

## Project Structure

```
├── app/
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/example/helloworld/
│       │   └── MainActivity.kt
│       └── res/
│           ├── layout/activity_main.xml
│           └── values/ (strings, colors, themes)
├── Dockerfile
├── docker-compose.yml
└── .github/workflows/build.yml
```

## License

[MIT](LICENSE)
