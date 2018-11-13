package my.image.upload;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by NIK on 12-11-2018.
 */
public interface Api {

    //the base URL for our API
    //make sure you are not using localhost
    //find the ip usinc ipconfig command
  // String BASE_URL = "http://192.168.1.18:8080/user/"; //nodejs project name =File-upload-using-multer-master
    String BASE_URL = "http://192.168.1.18:8081/api/files/";//nodejs project name = image.file.upload

    //this is our multipart request
    //we have two parameters on is name and other one is description
    @Multipart
   //@POST("fileUpload")
    @POST("upload")
    Call<MyResponse> uploadImage(@Part("image\"; filename=\"myfile.jpg\" ") RequestBody file/*, @Part("desc") RequestBody desc*/);

}