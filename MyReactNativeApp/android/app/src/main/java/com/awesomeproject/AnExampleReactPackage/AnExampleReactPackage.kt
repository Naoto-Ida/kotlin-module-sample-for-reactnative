package com.awesomeproject.AnExampleReactPackage

/**
 * Created by yanfeng on 2017/10/12.
 */

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

import java.util.ArrayList
import java.util.Collections

class AnExampleReactPackage : ReactPackage {

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        return emptyList()
    }

    override fun createNativeModules(
            reactContext: ReactApplicationContext): List<NativeModule> {
        val modules = ArrayList<NativeModule>()

        modules.add(ToastModule(reactContext))

        return modules
    }

}

