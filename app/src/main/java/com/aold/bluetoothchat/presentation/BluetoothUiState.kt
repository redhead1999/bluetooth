package com.aold.bluetoothchat.presentation

import com.aold.bluetoothchat.domain.chat.BluetoothDevice
import com.aold.bluetoothchat.domain.chat.BluetoothMessage

/**
 * @author Kirilin Yury on 05.06.2023.
 */
data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMessage: String? = null,
    val messages: List<BluetoothMessage> = emptyList(),


    )