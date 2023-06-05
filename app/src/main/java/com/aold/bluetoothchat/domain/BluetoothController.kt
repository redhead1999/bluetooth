package com.aold.bluetoothchat.domain

import com.aold.bluetoothchat.util.ConnectionResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * @author Kirilin Yury on 03.06.2023.
 */
interface BluetoothController {
    val isConnected: StateFlow<Boolean>
    val scannedDevices: StateFlow<List<BluetoothDevice>>
    val pairedDevices: StateFlow<List<BluetoothDevice>>
    val errors: SharedFlow<String>

    fun startDiscovery()
    fun stopDiscovery()

    fun startBluetoothServer(): Flow<ConnectionResult>
    fun connectToDevice(device: BluetoothDevice): Flow<ConnectionResult>

    suspend fun trySendMessage(message: String): BluetoothMessage?

    fun closeConnection()
    fun release()

}