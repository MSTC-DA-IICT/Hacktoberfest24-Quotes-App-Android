
package com.example.quotesapp

import android.app.Application
import com.example.quotesapp.di.quoteRepoModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class QuoteApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@QuoteApplication)
            modules(quoteRepoModule)
        }
    }
}