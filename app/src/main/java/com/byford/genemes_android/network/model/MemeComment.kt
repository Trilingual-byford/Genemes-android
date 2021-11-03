package com.byford.genemes_android.network.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*
@Parcelize
data class MemeComment(
    var id: Long,
    var userName: String? =null,
    var comment: String?,
    var postDate: Date
) : Parcelable