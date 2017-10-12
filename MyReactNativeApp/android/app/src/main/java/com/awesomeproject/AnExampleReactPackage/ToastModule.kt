package com.awesomeproject.AnExampleReactPackage

import android.widget.Toast

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

import java.util.HashMap

/**
 * Created by yanfeng on 2017/10/12.
 */

class ToastModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "ToastExample"
    }

    override fun getConstants(): Map<String, Any>? {
        val constants = HashMap<String, Any>()
        constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT)
        constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG)
        return constants
    }

    @ReactMethod
    fun show(message: String, duration: Int) {
        Toast.makeText(reactApplicationContext, message, duration).show()
    }

    companion object {

        private val DURATION_SHORT_KEY = "SHORT"
        private val DURATION_LONG_KEY = "LONG"
    }
}