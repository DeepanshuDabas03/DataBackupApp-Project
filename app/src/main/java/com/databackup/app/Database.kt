package com.databackup.app

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Data::class],
    version = 1
)
abstract class Database: RoomDatabase() {
    abstract fun dao(): Dao
}
