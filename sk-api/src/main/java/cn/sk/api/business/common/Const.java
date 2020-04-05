package cn.sk.api.business.common;


/**
 * 常量类
 */
public class Const {

    //树形默认父id
    public static final int DEFAULT_PARENTID = 0;
    //默认分割符号
    public static final String DEFAULT_SPLIT_SYMBOL = ";";

    //统一用户api接口前缀
    public interface Url{
        //本地
//        String UA_API_URL_PREFIX = "http://172.31.211.181:10040/ua/";
        //测试
//        String UA_API_URL_PREFIX = "http://172.31.23.181:10040/ua/";
        //正式
        String UA_API_URL_PREFIX = "http://172.31.23.187:10040/ua/";
        interface Emp{
            String EMP_TREESELECT = UA_API_URL_PREFIX + "emp/getEmpTree";
            String EMP_TREESELECT_BY_PERMIS = UA_API_URL_PREFIX + "emp/getEmpTreeByPermis";
            String QUERY_EMP_BY_EMPID = UA_API_URL_PREFIX + "emp/queryEmpByEmpId";
        }

    }
    //统一用户系统的报修系统分配权限标识
    public static final String UA_SYS_REPAIR_WX_PERMIS_FLAG = "repairWx";

    //报修记录状态
//    记录状态（01=未处理，02=正在处理，03=已处理）
    public interface RepairRecordStatus{
        String WAIT_HANDLE = "01";
        String WAIT_REPAIR = "02";
        String WAIT_CONFIRM = "03";
        String HANDLEING = "04";
        String WAIT_CHECK = "05";
        String FINISH = "06";
        String CANCEL_REPAIR = "07";
    }

    //上传的目录
    public static final String UPLOAD_PATH = "/upload/";
    public static final String BREAKDOWN_PIC_UPLOAD_PATH_URL = "static"+UPLOAD_PATH+"breakdownPic/";
    public static final String REPAIR_PIC_UPLOAD_PATH_URL = "static"+UPLOAD_PATH+"repairPic/";

    //字典类型
    public interface Dict{
        String RECORD_STATUS = "record_status";
        //性别
        String PERSON_SEX = "person_sex";
        //机构
        class Organ{
            //类型
            public static final String ORG_TYPE = "org_type";
        }
    }


}
