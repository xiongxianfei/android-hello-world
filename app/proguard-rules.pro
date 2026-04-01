# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in the Android SDK's default ProGuard configuration.

# Keep AppCompat activity names (required for manifest references)
-keep public class * extends androidx.appcompat.app.AppCompatActivity
