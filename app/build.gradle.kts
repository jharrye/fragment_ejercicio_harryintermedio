plugins {
    id("com.android.application")
}

android {
    namespace = "unal.todosalau.fragment_ejercicio_harryintermedio"
    compileSdk = 33

    defaultConfig {
        applicationId = "unal.todosalau.fragment_ejercicio_harryintermedio"
        minSdk = 27
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.5.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("androidx.navigation:navigation-fragment:2.5.3")
    implementation ("androidx.navigation:navigation-ui:2.5.3")

}
//clase 30-11-2023 51:51 minut
//despues de implementar estos dos creamos nav_graph atravez de res-new-android resourse file-
//luego buscamos navegation y le damos el nombre nev_graph.estando creada esta podemos adrentro
//interactuar con los fragmet creados anteriormente