package com.trodevel.uniqueidgenerator

import android.content.Context

class PersistentUniqueIdGenerator(context: Context, private val prefKey: String) : IUniqueIdGenerator {
    private val prefs = context.getSharedPreferences("id_generator_prefs", Context.MODE_PRIVATE)
    
    // The class has just one member: next_id: Integer, which is initialized with 1.
    private var next_id: Int = prefs.getInt(prefKey, 1)

    override fun getNextId(): Int {
        val current = next_id
        next_id++
        prefs.edit().putInt(prefKey, next_id).apply()
        return current
    }

    fun peekNextId(): Int {
        return next_id
    }
}
