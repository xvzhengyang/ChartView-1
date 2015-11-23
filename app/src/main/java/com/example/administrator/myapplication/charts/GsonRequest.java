package com.example.administrator.myapplication.charts;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Created by wudashan on 2015/11/19 0019.
 */
public class GsonRequest<T> extends BaseRequest<T> {

    private static final String TAG = "GsonRequest";

    private final Class<T> clazz;
    private final Gson gson = new Gson();
    private String mCharset = "utf-8";

    public GsonRequest(Context paramContext, String paramString, Class<T> paraClass, Map<String, String> paramMap, Response.Listener<T> paramListener, Response.ErrorListener paramErrorListener){
        super(paramContext, 0, paramString, paramMap, paramListener, paramErrorListener);
        this.clazz = paraClass;
    }

    protected Gson getGson() {
        return this.gson;
    }

    protected final String getResponseStr(NetworkResponse paramNetworkResponse){
        if (!TextUtils.isEmpty(this.mCharset)){
            String localStr = this.mCharset;
            try {
                Log.d(TAG,  new String(paramNetworkResponse.data, localStr));

//                return new String(paramNetworkResponse.data, localStr);
                return "{\"count\":242,\"symbol\":\"000001\",\"name\":\"\\u4e0a\\u8bc1\\u6307\\u6570\",\"data\":[[\"0930\",3630.87,3630.87,333010700],[\"0931\",3632.65,3631.76,939260800],[\"0932\",3630.47,3631.33,300021600],[\"0933\",3626.86,3630.213,271478000],[\"0934\",3622.66,3628.702,285521600],[\"0935\",3620.86,3627.395,264258900],[\"0936\",3622.26,3626.661,262887600],[\"0937\",3626.31,3626.618,276034100],[\"0938\",3630.12,3627.007,266141100],[\"0939\",3631.48,3627.454,231312100],[\"0940\",3633.52,3628.005,254847400],[\"0941\",3634.3,3628.53,248159600],[\"0942\",3635.79,3629.088,235567200],[\"0943\",3636.56,3629.622,241355400],[\"0944\",3636.72,3630.095,248805900],[\"0945\",3635.98,3630.463,214320400],[\"0946\",3635.53,3630.761,208153200],[\"0947\",3634.17,3630.951,203629400],[\"0948\",3634.21,3631.122,199199600],[\"0949\",3633.61,3631.247,197795900],[\"0950\",3632.36,3631.3,201332100],[\"0951\",3632.7,3631.363,196711700],[\"0952\",3633.05,3631.437,170647300],[\"0953\",3633.14,3631.508,169988200],[\"0954\",3635.57,3631.67,168166400],[\"0955\",3638.64,3631.938,184657000],[\"0956\",3639.5,3632.218,197932000],[\"0957\",3639.61,3632.482,198624700],[\"0958\",3638.08,3632.675,175879000],[\"0959\",3635.79,3632.779,163485400],[\"1000\",3635.96,3632.882,150615100],[\"1001\",3635.79,3632.973,139620200],[\"1002\",3634.91,3633.031,138282300],[\"1003\",3633.69,3633.051,158890500],[\"1004\",3631.89,3633.017,165009600],[\"1005\",3630.48,3632.947,159348700],[\"1006\",3628.8,3632.835,160331600],[\"1007\",3627.47,3632.694,199404400],[\"1008\",3627.32,3632.556,170221300],[\"1009\",3626.76,3632.411,142571700],[\"1010\",3628.6,3632.318,148847000],[\"1011\",3631.73,3632.304,157289700],[\"1012\",3633.64,3632.335,141655300],[\"1013\",3632.92,3632.348,154155100],[\"1014\",3632.18,3632.345,139741600],[\"1015\",3632.41,3632.346,129487100],[\"1016\",3632.78,3632.355,113228100],[\"1017\",3633.11,3632.371,118647500],[\"1018\",3634.92,3632.423,133600300],[\"1019\",3637.71,3632.529,145219000],[\"1020\",3639.31,3632.662,152339200],[\"1021\",3639.9,3632.801,145548200],[\"1022\",3640.34,3632.943,132184300],[\"1023\",3640.33,3633.08,130868000],[\"1024\",3639.94,3633.205,136173800],[\"1025\",3639.61,3633.319,118141400],[\"1026\",3637.9,3633.399,115351100],[\"1027\",3636.31,3633.45,109677700],[\"1028\",3636.24,3633.497,111606900],[\"1029\",3636.62,3633.549,115318200],[\"1030\",3636.74,3633.601,111086100],[\"1031\",3637.45,3633.663,115269400],[\"1032\",3637.52,3633.725,116957100],[\"1033\",3636.54,3633.769,118891900],[\"1034\",3635.63,3633.797,116588300],[\"1035\",3633.94,3633.799,125657300],[\"1036\",3632.08,3633.774,117850400],[\"1037\",3631.07,3633.734,118669600],[\"1038\",3631.32,3633.699,97724500],[\"1039\",3632.55,3633.683,93736700],[\"1040\",3634.51,3633.694,102802300],[\"1041\",3636.08,3633.727,109083600],[\"1042\",3637.88,3633.784,108578300],[\"1043\",3637.42,3633.833,99017800],[\"1044\",3639.21,3633.905,98914000],[\"1045\",3641.34,3634.003,114654700],[\"1046\",3643.78,3634.13,116000700],[\"1047\",3645.17,3634.271,114803800],[\"1048\",3645.25,3634.41,110302300],[\"1049\",3643.73,3634.527,105222900],[\"1050\",3642.71,3634.628,90234700],[\"1051\",3642.45,3634.723,81811700],[\"1052\",3643.11,3634.824,85748400],[\"1053\",3644.18,3634.936,86956700],[\"1054\",3644.2,3635.045,93862400],[\"1055\",3644.39,3635.153,104932600],[\"1056\",3644.43,3635.26,102040000],[\"1057\",3643.21,3635.35,93237500],[\"1058\",3642.39,3635.429,93505800],[\"1059\",3641.83,3635.501,91276100],[\"1100\",3641.92,3635.571,88432500],[\"1101\",3643.18,3635.654,96267500],[\"1102\",3644.34,3635.747,94810200],[\"1103\",3646.07,3635.857,91962900],[\"1104\",3647.74,3635.982,108145500],[\"1105\",3649.46,3636.123,125106300],[\"1106\",3650.51,3636.271,122486100],[\"1107\",3650.44,3636.415,115473300],[\"1108\",3649.22,3636.545,96652800],[\"1109\",3648.46,3636.664,89058600],[\"1110\",3648.37,3636.78,71571700],[\"1111\",3648.64,3636.896,83824200],[\"1112\",3649.07,3637.014,81989600],[\"1113\",3648.8,3637.128,87970500],[\"1114\",3648.7,3637.238,88575000],[\"1115\",3650.05,3637.359,98258100],[\"1116\",3652.69,3637.502,111455500],[\"1117\",3653.64,3637.651,115472300],[\"1118\",3653.94,3637.801,113484700],[\"1119\",3653.09,3637.94,104021000],[\"1120\",3652.07,3638.067,100199800],[\"1121\",3650.38,3638.177,90602000],[\"1122\",3650.65,3638.287,92107100],[\"1123\",3649.38,3638.385,89867100],[\"1124\",3648.73,3638.475,78768900],[\"1125\",3647.4,3638.552,82429300],[\"1126\",3646.3,3638.618,91476000],[\"1127\",3645.24,3638.674,105676400],[\"1128\",3644.48,3638.723,88609600],[\"1129\",3644.8,3638.773,79808200],[\"1130\",3644.7,3638.822,8466900]],\"yestclose\":3630.5,\"lastVolume\":17771006400,\"date\":\"20151123\"}";
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse paramNetworkResponse) {
        Log.d(TAG, "parseNetworkResponse");
        String str = getResponseStr(paramNetworkResponse);
        return Response.success(this.gson.fromJson(str,this.clazz), getCacheEntry(paramNetworkResponse));
    }

    protected void setCharset(String paramString){
        this.mCharset = paramString;
    }
}
