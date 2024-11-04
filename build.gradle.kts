plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.compose.multiplatform) apply false
//    alias(libs.plugins.apollo.graphql) apply false
//    alias(libs.plugins.benmanes.versions) apply false
    alias(libs.plugins.cash.paparazzi) apply false
    alias(libs.plugins.cash.sqldelight) apply false
//    alias(libs.plugins.detekt) apply false
//    alias(libs.plugins.kotlinter) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.kotlinx.serialization) apply false
    alias(libs.plugins.square.sort.dependencies) apply false
}

subprojects {
    apply(plugin = "com.squareup.sort-dependencies")
    //apply(plugin = "org.jmailen.kotlinter")
}
