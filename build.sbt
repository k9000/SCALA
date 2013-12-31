import android.Keys._

android.Plugin.androidBuild

name := "SCALA"

platformTarget in Android := "android-19"

run <<= run in Android

install <<= install in Android