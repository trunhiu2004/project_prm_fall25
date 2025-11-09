package com.example.project_prm.retrofit;


import com.example.project_prm.model.DonHangModel;
import com.example.project_prm.model.LoaiSpModel;
import com.example.project_prm.model.SanPhamMoiModel;
import com.example.project_prm.model.UserModel;
import com.example.project_prm.model.OrderCreateResponse;
import com.example.project_prm.model.CreatePaymentResponse;
import com.example.project_prm.model.PaymentStatusResponse;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiBanHang {
    @GET("getloaisp.php")
    Observable<LoaiSpModel> getLoaiSp();

    @GET("getspmoi.php")
    Observable<SanPhamMoiModel> getSpMoi();

    @POST("chitiet.php")
    @FormUrlEncoded
    Observable<SanPhamMoiModel> getSanPham(
            @Field("page") int page,
            @Field("loai") int loai
    );

    @POST("dangki.php")
    @FormUrlEncoded
    Observable<UserModel> dangki(
            @Field("email") String email,
            @Field("pass") String pass,
            @Field("username") String username,
            @Field("mobile") String mobile
    );

    @POST("dangnhap.php")
    @FormUrlEncoded
    Observable<UserModel> dangnhap(
            @Field("email") String email,
            @Field("pass") String pass
    );

    @POST("donhang.php")
    @FormUrlEncoded
    Observable<UserModel> createOrder(
            @Field("email") String email,
            @Field("sdt") String sdt,
            @Field("tongtien") String tongtien,
            @Field("iduser") int id,
            @Field("diachi") String diachi,
            @Field("soluong") int soluong,
            @Field("chitiet") String chitiet
    );

    // New: same endpoint but typed to receive iddonhang in response
    @POST("donhang.php")
    @FormUrlEncoded
    Observable<OrderCreateResponse> createOrderV2(
            @Field("email") String email,
            @Field("sdt") String sdt,
            @Field("tongtien") String tongtien,
            @Field("iduser") int id,
            @Field("diachi") String diachi,
            @Field("soluong") int soluong,
            @Field("chitiet") String chitiet
    );

    // New: create payment for order -> returns qr_url
    @POST("create_payment_for_order.php")
    @FormUrlEncoded
    Observable<CreatePaymentResponse> createPaymentForOrder(
            @Field("iddonhang") int iddonhang
    );

    // New: check payment status for order
    @POST("check_payment_for_order.php")
    @FormUrlEncoded
    Observable<PaymentStatusResponse> checkPaymentForOrder(
            @Field("iddonhang") int iddonhang
    );

    @POST("xemdonhang.php")
    @FormUrlEncoded
    Observable<DonHangModel> xemDonHang(
            @Field("iduser") int id
    );

    @POST("timkiem.php")
    @FormUrlEncoded
    Observable<SanPhamMoiModel> search(
            @Field("search") String search
    );
}
