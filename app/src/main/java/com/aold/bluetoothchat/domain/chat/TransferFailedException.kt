package com.aold.bluetoothchat.domain.chat

import java.io.IOException

/**
 * @author Kirilin Yury on 03.06.2023.
 */
class TransferFailedException : IOException("Неудачная попытка трансфера данных")