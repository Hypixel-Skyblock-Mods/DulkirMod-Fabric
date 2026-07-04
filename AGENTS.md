# Repository Instructions

This is a Fabric client mod built with Gradle, Kotlin, Java 25, and Fabric Loom.

## Build and Verification

- Use `./gradlew build` on Linux/macOS or `.\gradlew.bat build` on Windows.
- Keep Java compatibility aligned with the minimum Java version required by the target Minecraft release.
- Update `gradle.properties` for Minecraft, Fabric Loader, Fabric API, Loom, and Fabric Language Kotlin version bumps.
- Keep `src/main/resources/fabric.mod.json` dependency bounds aligned with the Gradle dependency versions.

## CI and Releases

- CI builds every pull request and every branch push through `.github/workflows/build.yml`.
- Release builds only run for version tags through `.github/workflows/release.yml`.
- Use tags like `1.2.3` or `v1.2.3` for releases. The release workflow builds the project and uploads jars from `build/libs`.

## Contribution Notes

- Keep changes scoped to the feature or version bump being worked on.
- Prefer existing project patterns for commands, config, mixins, and utility code.
- Do not commit generated build outputs from `build/`, `.gradle/`, or local IDE metadata.
