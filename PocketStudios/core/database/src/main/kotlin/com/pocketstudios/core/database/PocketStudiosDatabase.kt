package com.pocketstudios.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pocketstudios.core.database.dao.ProjectDao
import com.pocketstudios.core.database.entity.ProjectEntity
import com.pocketstudios.core.database.entity.TextOverlayEntity
import com.pocketstudios.core.database.entity.VideoTrackEntity

@Database(
    entities = [
        ProjectEntity::class,
        VideoTrackEntity::class,
        TextOverlayEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class PocketStudiosDatabase : RoomDatabase() {
    abstract fun projectDao(): ProjectDao
}
