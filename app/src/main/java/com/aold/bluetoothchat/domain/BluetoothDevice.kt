package com.aold.bluetoothchat.domain

/**
 * @author Kirilin Yury on 03.06.2023.
 */

typealias BluetoothDeviceDomain = BluetoothDevice

data class BluetoothDevice(
    val name: String?,
    val address: String,
)