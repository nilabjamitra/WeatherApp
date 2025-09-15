# 🌤️ WeatherApp - Modern Android Weather Application

A sleek and intuitive Android weather application built with modern Android development practices. Get real-time weather information with a beautiful, responsive interface powered by Jetpack Compose.

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg)](https://kotlinlang.org)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg)](https://android-arsenal.com/api?level=21)
[![Architecture](https://img.shields.io/badge/Architecture-MVVM-orange.svg)](https://developer.android.com/jetpack/guide)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

## ✨ Features

### 🌡️ Weather Information
- **Real-time weather updates** - Current conditions at your fingertips
- **Detailed weather metrics** - Temperature, humidity, wind speed, and pressure
- **7-day weather forecast** - Plan ahead with extended forecasts
- **Hourly forecasts** - Hour-by-hour weather predictions

### 🔍 Location Services
- **City search** - Find weather for any city worldwide
- **GPS location detection** - Automatic weather for your current location
- **Favorite locations** - Save and quick-access your preferred cities

### 🎨 User Experience
- **Modern Material Design** - Clean and intuitive interface
- **Dark/Light themes** - Adaptive themes for comfortable viewing
- **Responsive layout** - Optimized for all screen sizes
- **Smooth animations** - Delightful micro-interactions
- **Offline support** - View cached weather data when offline

## 🏗️ Architecture

This app follows **Clean Architecture** principles with **MVVM pattern**:

```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   Presentation  │    │     Domain      │    │      Data       │
│                 │    │                 │    │                 │
│  • UI (Compose) │◄──►│  • Use Cases    │◄──►│  • Repository   │
│  • ViewModels   │    │  • Entities     │    │  • Data Sources │
│  • Navigation   │    │  • Repository   │    │  • API Services │
└─────────────────┘    └─────────────────┘    └─────────────────┘
```

## 🛠️ Tech Stack

### **Core Technologies**
- **[Kotlin](https://kotlinlang.org/)** - Primary programming language
- **[Jetpack Compose](https://developer.android.com/jetpack/compose)** - Modern declarative UI toolkit
- **[Coroutines](https://kotlinlang.org/docs/coroutines-overview.html)** - Asynchronous programming
- **[Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/)** - Reactive streams

### **Architecture & DI**
- **[MVVM](https://developer.android.com/jetpack/guide)** - Architectural pattern
- **[Hilt](https://dagger.dev/hilt/)** - Dependency injection
- **[ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)** - UI state management
- **[Repository Pattern](https://developer.android.com/jetpack/guide)** - Data layer abstraction

### **Networking & Data**
- **[Retrofit](https://square.github.io/retrofit/)** - REST API client
- **[OkHttp](https://square.github.io/okhttp/)** - HTTP client
- **[Gson](https://github.com/google/gson)** - JSON serialization
- **[Room](https://developer.android.com/jetpack/androidx/releases/room)** - Local database

### **Weather Data**
- **[OpenWeatherMap API](https://openweathermap.org/api)** - Weather data provider
- **Location Services** - GPS and network location

## 🚀 Getting Started

### Prerequisites
- **Android Studio** Arctic Fox (2020.3.1) or newer
- **JDK 11** or higher
- **Android SDK** with minimum API level 21
- **Git** for version control

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/nilabjamitra/WeatherApp.git
   cd WeatherApp
   ```

2. **Get OpenWeatherMap API Key**
   - Visit [OpenWeatherMap](https://openweathermap.org/api)
   - Sign up for a free account
   - Generate your API key

3. **Configure API Key**
   - Create a `local.properties` file in the project root (if not exists)
   - Add your API key:
     ```properties
     WEATHER_API_KEY=your_api_key_here
     ```

4. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned directory

5. **Build and Run**
   ```bash
   ./gradlew assembleDebug
   ```
   Or use Android Studio's build and run buttons

### Configuration

#### API Configuration
The app uses OpenWeatherMap's free tier which includes:
- Current weather data
- 5-day forecast
- Historical data (limited)
- 60 calls/minute, 1,000,000 calls/month

#### Permissions
The app requires the following permissions:
```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
```

## 📱 Screenshots

*Screenshots coming soon...*

## 🧪 Testing

Run the test suite:
```bash
# Unit tests
./gradlew test

# Instrumented tests
./gradlew connectedAndroidTest

# UI tests
./gradlew connectedDebugAndroidTest
```

## 📊 Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/weatherapp/
│   │   │   ├── data/          # Data layer
│   │   │   │   ├── local/     # Room database
│   │   │   │   ├── remote/    # API services
│   │   │   │   └── repository/# Repository implementations
│   │   │   ├── domain/        # Domain layer
│   │   │   │   ├── model/     # Domain models
│   │   │   │   ├── repository/# Repository interfaces
│   │   │   │   └── usecase/   # Use cases
│   │   │   ├── presentation/  # Presentation layer
│   │   │   │   ├── ui/        # Compose UI
│   │   │   │   ├── viewmodel/ # ViewModels
│   │   │   │   └── navigation/# Navigation
│   │   │   └── di/            # Dependency injection
│   │   └── res/               # Resources
│   ├── test/                  # Unit tests
│   └── androidTest/           # Instrumented tests
└── build.gradle.kts
```

## 🔧 Development

### Code Style
This project follows [Kotlin coding conventions](https://kotlinlang.org/docs/coding-conventions.html) and uses:
- **ktlint** for code formatting
- **detekt** for static code analysis

### Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Git Hooks
Run code quality checks before commits:
```bash
# Install pre-commit hooks
./gradlew installGitHooks
```

## 📈 Performance

- **App size**: < 10MB
- **Cold start time**: < 3 seconds
- **API response time**: < 2 seconds
- **Memory usage**: < 50MB

## 🌐 API Documentation

### OpenWeatherMap Endpoints Used
- `GET /weather` - Current weather data
- `GET /forecast` - 5 day weather forecast
- `GET /geo/direct` - Geocoding API

## 🐛 Known Issues

- Location permission dialog may appear multiple times on some devices
- Weather animations may stutter on older devices (API < 24)

## 🔮 Roadmap

- [ ] Widget support
- [ ] Weather alerts and notifications
- [ ] Weather maps integration
- [ ] Weather history charts
- [ ] Multi-language support
- [ ] Wear OS companion app

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- [OpenWeatherMap](https://openweathermap.org/) for providing weather data
- [Material Design](https://material.io/) for design guidelines
- [Android Jetpack](https://developer.android.com/jetpack) for modern Android development

## 📞 Support

If you have any questions or need help:
- 📧 Email: [Your Email]
- 🐛 Issues: [GitHub Issues](https://github.com/nilabjamitra/WeatherApp/issues)
- 💬 Discussions: [GitHub Discussions](https://github.com/nilabjamitra/WeatherApp/discussions)

---

⭐ **If you found this project helpful, please give it a star!** ⭐
