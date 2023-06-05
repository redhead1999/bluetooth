package com.aold.bluetoothchat.data

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.aold.bluetoothchat.domain.chat.BluetoothDeviceDomain

/**
 * @author Kirilin Yury on 03.06.2023.
 */
@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}