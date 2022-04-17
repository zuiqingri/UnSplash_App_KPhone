package com.star.unsplash_app_kphone.utils

object Constants{
    const val TAG:String="LOG"
}

enum class SEARCH_TYPE{
    PHOTO,
    USER
}

enum class RESPONSE_STATUS {
    OKAY,
    FAIL,
    NO_CONTENT
}

object API{
    const val BASE_URL : String = "https://api.unsplash.com/"

    const val CLIENT_ID : String ="lCNVra14GYH_fO4S7FqYWZBXjzm4CVXVCemigA7WRqQ"

    const val SEARCH_PHOTOS : String = "search/photos"
    const val SEARCH_USERS : String = "search/users"
}