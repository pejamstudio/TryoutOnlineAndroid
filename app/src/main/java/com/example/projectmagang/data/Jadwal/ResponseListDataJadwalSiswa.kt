package com.example.projectmagang.data.Jadwal

import com.google.gson.annotations.SerializedName


data class ResponseListDataJadwalSiswa (
    @SerializedName("response") val response : Boolean,
    @SerializedName("message") val message : String,
    @SerializedName("jadwal") val jadwal : List<DataJadwalSiswa>
)