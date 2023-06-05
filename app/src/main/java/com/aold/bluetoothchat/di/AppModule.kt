package com.aold.bluetoothchat.di

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.aold.bluetoothchat.data.AndroidBluetoothController
import com.aold.bluetoothchat.domain.BluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author Kirilin Yury on 03.06.2023.
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @RequiresApi(Build.VERSION_CODES.M)
    @Provides
    @Singleton
    fun provideBluetoothController(@ApplicationContext context: Context): BluetoothController {
        return AndroidBluetoothController(context)

    }
}