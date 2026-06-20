import com.example.gravityfallsapi.data.model.GravityFallsCharacter
import retrofit2.http.GET
import retrofit2.http.Path
interface GravityFallsApiService {
    @GET("api/characters")
    suspend fun getAllCharacters(): List<GravityFallsCharacter>
    @GET("api/characters/{name}")
    suspend fun getCharacterByName(@Path("name") name: String): GravityFallsCharacter
}