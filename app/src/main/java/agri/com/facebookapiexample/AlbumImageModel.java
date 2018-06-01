package agri.com.facebookapiexample;

import java.util.List;

/**
 * Created by akash.sharma on 6/1/2018.
 */

public class AlbumImageModel {


    /**
     * data : [{"created_time":"2018-05-29T07:11:25+0000","id":"1964678360325396"},{"created_time":"2018-05-15T15:52:25+0000","id":"1951762554950310"},{"created_time":"2018-05-15T15:52:25+0000","id":"1951762278283671"},{"created_time":"2018-05-15T15:52:25+0000","id":"1951762161617016"},{"created_time":"2018-05-15T15:52:25+0000","id":"1951761858283713"},{"created_time":"2018-05-15T15:52:25+0000","id":"1951761344950431"},{"created_time":"2018-05-15T15:52:25+0000","id":"1951760968283802"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951746714951894"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951746661618566"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951746604951905"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951746531618579"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951746474951918"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951746424951923"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951746368285262"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951746294951936"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951746231618609"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951746128285286"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951746031618629"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951745961618636"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951745864951979"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951745791618653"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951745754951990"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951745701618662"},{"created_time":"2018-05-15T15:32:17+0000","id":"1951745638285335"},{"created_time":"2018-05-15T15:22:58+0000","id":"1951738351619397"}]
     * paging : {"cursors":{"before":"MTk2NDY3ODM2MDMyNTM5NgZDZD","after":"MTk1MTczODM1MTYxOTM5NwZDZD"},"next":"https://graph.facebook.com/v3.0/387193401407241/photos?access_token=EAAESrYz0At8BAGmoZAzXWpU2UK565rVVVsdLsZApuLgqi25GhFZBjOIS9qNX1UTQyTjLJG0ZCdZB34VIMTeKrTfqP6ZCrHxbZCljinP2HQZBn4ihRZBMTQRH1RnkHIWPfZBGF5VSmFZAqZCGHZBfQSu239ahEVnMOG5NAErB6w37bZBfvX57HOYw9DJ4AAWHxW2BSdNE13Ahq8eNCilgZDZD&limit=25&after=MTk1MTczODM1MTYxOTM5NwZDZD"}
     */

    private PagingBean paging;
    private List<DataBean> data;

    public PagingBean getPaging() {
        return paging;
    }

    public void setPaging(PagingBean paging) {
        this.paging = paging;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class PagingBean {
        /**
         * cursors : {"before":"MTk2NDY3ODM2MDMyNTM5NgZDZD","after":"MTk1MTczODM1MTYxOTM5NwZDZD"}
         * next : https://graph.facebook.com/v3.0/387193401407241/photos?access_token=EAAESrYz0At8BAGmoZAzXWpU2UK565rVVVsdLsZApuLgqi25GhFZBjOIS9qNX1UTQyTjLJG0ZCdZB34VIMTeKrTfqP6ZCrHxbZCljinP2HQZBn4ihRZBMTQRH1RnkHIWPfZBGF5VSmFZAqZCGHZBfQSu239ahEVnMOG5NAErB6w37bZBfvX57HOYw9DJ4AAWHxW2BSdNE13Ahq8eNCilgZDZD&limit=25&after=MTk1MTczODM1MTYxOTM5NwZDZD
         */

        private CursorsBean cursors;
        private String next;

        public CursorsBean getCursors() {
            return cursors;
        }

        public void setCursors(CursorsBean cursors) {
            this.cursors = cursors;
        }

        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }

        public static class CursorsBean {
            /**
             * before : MTk2NDY3ODM2MDMyNTM5NgZDZD
             * after : MTk1MTczODM1MTYxOTM5NwZDZD
             */

            private String before;
            private String after;

            public String getBefore() {
                return before;
            }

            public void setBefore(String before) {
                this.before = before;
            }

            public String getAfter() {
                return after;
            }

            public void setAfter(String after) {
                this.after = after;
            }
        }
    }

    public static class DataBean {
        /**
         * created_time : 2018-05-29T07:11:25+0000
         * id : 1964678360325396
         */

        private String created_time;
        private String id;

        public String getCreated_time() {
            return created_time;
        }

        public void setCreated_time(String created_time) {
            this.created_time = created_time;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}