package com.amostrone.akash.pawsome;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MainInterface {
    @GET("v1/breeds")
    Call<String> STRING_CALL(
            @Query("page") int page,
            @Query("limit") int limit
    );
}
