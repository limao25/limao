package com.example.lib_core_one.entity;

public class MLoginEntity<T> {

    /**
     * code : 0
     * msg : 请求成功
     * data : {"id":47,"phonenumber":"18251514385","nick":null,"headimg":null,"imaccount":null,"token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxODI1MTUxNDM4NSJ9.BYVgBtMabZkxfBNtTlNdcFqOV6ZAflYyzVuJUmyFYIg","lon":null,"lat":null}
     */

    private int code;
    private String msg;
    private DataBean data;
    private T Tdata;

    public T getTdata() {
        return Tdata;
    }

    public void setTdata(T tdata) {
        Tdata = tdata;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 47
         * phonenumber : 18251514385
         * nick : null
         * headimg : null
         * imaccount : null
         * token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxODI1MTUxNDM4NSJ9.BYVgBtMabZkxfBNtTlNdcFqOV6ZAflYyzVuJUmyFYIg
         * lon : null
         * lat : null
         */

        private int id;
        private String phonenumber;
        private Object nick;
        private Object headimg;
        private Object imaccount;
        private String token;
        private Object lon;
        private Object lat;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
        }

        public Object getNick() {
            return nick;
        }

        public void setNick(Object nick) {
            this.nick = nick;
        }

        public Object getHeadimg() {
            return headimg;
        }

        public void setHeadimg(Object headimg) {
            this.headimg = headimg;
        }

        public Object getImaccount() {
            return imaccount;
        }

        public void setImaccount(Object imaccount) {
            this.imaccount = imaccount;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public Object getLon() {
            return lon;
        }

        public void setLon(Object lon) {
            this.lon = lon;
        }

        public Object getLat() {
            return lat;
        }

        public void setLat(Object lat) {
            this.lat = lat;
        }
    }
}
