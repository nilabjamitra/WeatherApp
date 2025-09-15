# 🌤️ WeatherApp - Simple Android Weather Application

A simple Android weather application built with Kotlin and Jetpack Compose.

## ✨ Features

- Real-time weather information
- Simple and intuitive interface
- Material Design UI components
- Location-based weather updates

## 🛠️ Tech Stack

- **Kotlin** - Primary programming language
- **Jetpack Compose** - Modern UI toolkit
- **Material Design** - UI components and theming
- **Android SDK** - Android development framework

## 📊 Project Structure

Simple Android app structure:

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/weatherapp/
│   │   │   ├── MainActivity.kt        # Main activity
│   │   │   └── ui/theme/             # UI theme components
│   │   ├── res/                     # App resources
│   │   └── AndroidManifest.xml      # App manifest
│   ├── androidTest/                 # Instrumented tests
│   └── test/                        # Unit tests
├── build.gradle.kts                 # App build configuration
├── proguard-rules.pro              # ProGuard rules
└── .gitignore                       # Git ignore rules
```

## 🚀 Getting Started

### Prerequisites

- Android Studio Arctic Fox or newer
- JDK 11 or higher
- Android SDK with minimum API level 21

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/nilabjamitra/WeatherApp.git
   cd WeatherApp
   ```

2. Open in Android Studio:
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned directory

3. Build and run:
   ```bash
   ./gradlew assembleDebug
   ```
   Or use Android Studio's build and run buttons

## 🔧 Development

The app is structured as a simple Android application:

- **MainActivity.kt** - Contains the main application logic and UI
- **ui/theme/** - Contains theming and styling components
- **res/** - Contains app resources (layouts, strings, drawables, etc.)

## 📱 App Architecture

This is a simple Android app with:
- Single Activity architecture using Jetpack Compose
- Material Design components for UI
- Basic modular structure with theme separation

## 🧪 Testing

Run tests:
```bash
# Unit tests
./gradlew test

# Instrumented tests
./gradlew connectedAndroidTest
```

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- [Material Design](https://material.io/) for design guidelines
- [Android Jetpack](https://developer.android.com/jetpack) for modern Android development

---

⭐ If you found this project helpful, please give it a star! ⭐
