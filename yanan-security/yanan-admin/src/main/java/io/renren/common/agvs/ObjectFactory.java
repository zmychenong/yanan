
package io.renren.common.agvs;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.renren.common.agvs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IOSwitchData_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "IOSwitchData");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ParkMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ParkMessage");
    private final static QName _ArrayOfIOShowData_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfIOShowData");
    private final static QName _PathDirectionMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "PathDirectionMessage");
    private final static QName _EquipmentData_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "EquipmentData");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Company_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "Company");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfClusterMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfClusterMessage");
    private final static QName _ArrayOfStaticOperationParemeters_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfStaticOperationParemeters");
    private final static QName _ArrayOfunsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfunsignedShort");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfIOCardData_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfIOCardData");
    private final static QName _ArrayOfCompany_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfCompany");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ClusterMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ClusterMessage");
    private final static QName _IOShowData_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "IOShowData");
    private final static QName _ArrayOfUserData_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfUserData");
    private final static QName _ChargeParkMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ChargeParkMessage");
    private final static QName _StationMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "StationMessage");
    private final static QName _ArrayOfWorkAreaName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfWorkAreaName");
    private final static QName _ArrayOfAGVStatusMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfAGVStatusMessage");
    private final static QName _StaticOperationParemeters_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "StaticOperationParemeters");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _WorkAreaName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "WorkAreaName");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfAGVName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfAGVName");
    private final static QName _ArrayOfEquipmentData_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfEquipmentData");
    private final static QName _AGVStatusMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "AGVStatusMessage");
    private final static QName _UserData_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "UserData");
    private final static QName _IOCardData_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "IOCardData");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ArrayOfPathDirectionMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfPathDirectionMessage");
    private final static QName _ArrayOfAGVStepMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfAGVStepMessage");
    private final static QName _AGVType_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "AGVType");
    private final static QName _Factory_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "Factory");
    private final static QName _ArrayOfAGVOrderMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfAGVOrderMessage");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _ArrayOfParkMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfParkMessage");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfStationMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfStationMessage");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfChargeParkMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfChargeParkMessage");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfFactory_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfFactory");
    private final static QName _AGVName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "AGVName");
    private final static QName _ArrayOfIOSwitchData_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "ArrayOfIOSwitchData");
    private final static QName _AGVStepMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "AGVStepMessage");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _AGVOrderMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", "AGVOrderMessage");
    private final static QName _GetCompanyResponseGetCompanyResult_QNAME = new QName("http://tempuri.org/", "GetCompanyResult");
    private final static QName _GetAllCompanyResponseGetAllCompanyResult_QNAME = new QName("http://tempuri.org/", "GetAllCompanyResult");
    private final static QName _ModifyStartModeName_QNAME = new QName("http://tempuri.org/", "Name");
    private final static QName _SetPathDirectionArrayPathDirectionArray_QNAME = new QName("http://tempuri.org/", "PathDirectionArray");
    private final static QName _GetEquipmentResponseGetEquipmentResult_QNAME = new QName("http://tempuri.org/", "GetEquipmentResult");
    private final static QName _ModifyStationStation_QNAME = new QName("http://tempuri.org/", "Station");
    private final static QName _GetOrderResponseGetOrderResult_QNAME = new QName("http://tempuri.org/", "GetOrderResult");
    private final static QName _GetAllUserArrayResponseGetAllUserArrayResult_QNAME = new QName("http://tempuri.org/", "GetAllUserArrayResult");
    private final static QName _GetCarrierArrayResponseGetCarrierArrayResult_QNAME = new QName("http://tempuri.org/", "GetCarrierArrayResult");
    private final static QName _AddEquipmentEquipment_QNAME = new QName("http://tempuri.org/", "Equipment");
    private final static QName _GetStationArrayResponseGetStationArrayResult_QNAME = new QName("http://tempuri.org/", "GetStationArrayResult");
    private final static QName _AddStandardOrderOrderMessage_QNAME = new QName("http://tempuri.org/", "OrderMessage");
    private final static QName _GetStationResponseGetStationResult_QNAME = new QName("http://tempuri.org/", "GetStationResult");
    private final static QName _GetRightByNameUserName_QNAME = new QName("http://tempuri.org/", "UserName");
    private final static QName _AddSystemControlSysVersion_QNAME = new QName("http://tempuri.org/", "SysVersion");
    private final static QName _AddCardCard_QNAME = new QName("http://tempuri.org/", "Card");
    private final static QName _ModifyPathDirectionPathMessage_QNAME = new QName("http://tempuri.org/", "PathMessage");
    private final static QName _DelStandardStepAGVStep_QNAME = new QName("http://tempuri.org/", "AGVStep");
    private final static QName _GetWorkAreaByEquipmentIDAndTypeResponseGetWorkAreaByEquipmentIDAndTypeResult_QNAME = new QName("http://tempuri.org/", "GetWorkAreaByEquipmentIDAndTypeResult");
    private final static QName _GetChargeParkListResponseGetChargeParkListResult_QNAME = new QName("http://tempuri.org/", "GetChargeParkListResult");
    private final static QName _GetAllWorkAreaAGVStatusArrayResponseGetAllWorkAreaAGVStatusArrayResult_QNAME = new QName("http://tempuri.org/", "GetAllWorkAreaAGVStatusArrayResult");
    private final static QName _GetCarrierStatusArrayResponseGetCarrierStatusArrayResult_QNAME = new QName("http://tempuri.org/", "GetCarrierStatusArrayResult");
    private final static QName _GetCardArrayResponseGetCardArrayResult_QNAME = new QName("http://tempuri.org/", "GetCardArrayResult");
    private final static QName _AddChargeParkListChargeParkList_QNAME = new QName("http://tempuri.org/", "chargeParkList");
    private final static QName _AddIOSwitchVirtualIO_QNAME = new QName("http://tempuri.org/", "VirtualIO");
    private final static QName _GetIOSwitchArrayResponseGetIOSwitchArrayResult_QNAME = new QName("http://tempuri.org/", "GetIOSwitchArrayResult");
    private final static QName _GetAllWorkAreaResponseGetAllWorkAreaResult_QNAME = new QName("http://tempuri.org/", "GetAllWorkAreaResult");
    private final static QName _GetAllWorkAreaEquipmentArrayResponseGetAllWorkAreaEquipmentArrayResult_QNAME = new QName("http://tempuri.org/", "GetAllWorkAreaEquipmentArrayResult");
    private final static QName _GetCarrierResponseGetCarrierResult_QNAME = new QName("http://tempuri.org/", "GetCarrierResult");
    private final static QName _ModifyChargeParkCurChargePark_QNAME = new QName("http://tempuri.org/", "CurChargePark");
    private final static QName _GetChargeParkResponseGetChargeParkResult_QNAME = new QName("http://tempuri.org/", "GetChargeParkResult");
    private final static QName _GetAllWorkAreaInCompanyResponseGetAllWorkAreaInCompanyResult_QNAME = new QName("http://tempuri.org/", "GetAllWorkAreaInCompanyResult");
    private final static QName _GetStandardOrderResponseGetStandardOrderResult_QNAME = new QName("http://tempuri.org/", "GetStandardOrderResult");
    private final static QName _AddClusterCluster_QNAME = new QName("http://tempuri.org/", "Cluster");
    private final static QName _SetStationArrayStationArray_QNAME = new QName("http://tempuri.org/", "StationArray");
    private final static QName _GetFactoryResponseGetFactoryResult_QNAME = new QName("http://tempuri.org/", "GetFactoryResult");
    private final static QName _GetStandardOrderArrayResponseGetStandardOrderArrayResult_QNAME = new QName("http://tempuri.org/", "GetStandardOrderArrayResult");
    private final static QName _GetStaticOpResponseGetStaticOpResult_QNAME = new QName("http://tempuri.org/", "GetStaticOpResult");
    private final static QName _GetEquipmentArrayResponseGetEquipmentArrayResult_QNAME = new QName("http://tempuri.org/", "GetEquipmentArrayResult");
    private final static QName _AddStaticOpPar_QNAME = new QName("http://tempuri.org/", "Par");
    private final static QName _GetOrderArrayResponseGetOrderArrayResult_QNAME = new QName("http://tempuri.org/", "GetOrderArrayResult");
    private final static QName _WriteBlackBoxFileStrBlackBox_QNAME = new QName("http://tempuri.org/", "strBlackBox");
    private final static QName _GetIOSwitchResponseGetIOSwitchResult_QNAME = new QName("http://tempuri.org/", "GetIOSwitchResult");
    private final static QName _GetClusterArrayResponseGetClusterArrayResult_QNAME = new QName("http://tempuri.org/", "GetClusterArrayResult");
    private final static QName _GetPasswordByNameResponseGetPasswordByNameResult_QNAME = new QName("http://tempuri.org/", "GetPasswordByNameResult");
    private final static QName _GetWorkAreaResponseGetWorkAreaResult_QNAME = new QName("http://tempuri.org/", "GetWorkAreaResult");
    private final static QName _GetStaticOpArrayResponseGetStaticOpArrayResult_QNAME = new QName("http://tempuri.org/", "GetStaticOpArrayResult");
    private final static QName _GetAllWorkAreaStationChargeParkArrayResponseGetAllWorkAreaStationChargeParkArrayResult_QNAME = new QName("http://tempuri.org/", "GetAllWorkAreaStationChargeParkArrayResult");
    private final static QName _ModifyStandardOrderCurOrderMessage_QNAME = new QName("http://tempuri.org/", "CurOrderMessage");
    private final static QName _GetPathDirectionArrayResponseGetPathDirectionArrayResult_QNAME = new QName("http://tempuri.org/", "GetPathDirectionArrayResult");
    private final static QName _GetStandardStepArrayResponseGetStandardStepArrayResult_QNAME = new QName("http://tempuri.org/", "GetStandardStepArrayResult");
    private final static QName _GetAllFactoryInCompanyResponseGetAllFactoryInCompanyResult_QNAME = new QName("http://tempuri.org/", "GetAllFactoryInCompanyResult");
    private final static QName _GetAllWorkAreaInFactoryResponseGetAllWorkAreaInFactoryResult_QNAME = new QName("http://tempuri.org/", "GetAllWorkAreaInFactoryResult");
    private final static QName _GetCardResponseGetCardResult_QNAME = new QName("http://tempuri.org/", "GetCardResult");
    private final static QName _GetAllWorkAreaOrderArrayResponseGetAllWorkAreaOrderArrayResult_QNAME = new QName("http://tempuri.org/", "GetAllWorkAreaOrderArrayResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.renren.common.agvs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetbControlCarriersResponse }
     * 
     */
    public SetbControlCarriersResponse createSetbControlCarriersResponse() {
        return new SetbControlCarriersResponse();
    }

    /**
     * Create an instance of {@link AddWorkAreaResponse }
     * 
     */
    public AddWorkAreaResponse createAddWorkAreaResponse() {
        return new AddWorkAreaResponse();
    }

    /**
     * Create an instance of {@link AddOrder }
     * 
     */
    public AddOrder createAddOrder() {
        return new AddOrder();
    }

    /**
     * Create an instance of {@link AGVOrderMessage }
     * 
     */
    public AGVOrderMessage createAGVOrderMessage() {
        return new AGVOrderMessage();
    }

    /**
     * Create an instance of {@link GetAllCompany }
     * 
     */
    public GetAllCompany createGetAllCompany() {
        return new GetAllCompany();
    }

    /**
     * Create an instance of {@link DelPathDirection }
     * 
     */
    public DelPathDirection createDelPathDirection() {
        return new DelPathDirection();
    }

    /**
     * Create an instance of {@link WorkAreaName }
     * 
     */
    public WorkAreaName createWorkAreaName() {
        return new WorkAreaName();
    }

    /**
     * Create an instance of {@link GetOrderMaxIDResponse }
     * 
     */
    public GetOrderMaxIDResponse createGetOrderMaxIDResponse() {
        return new GetOrderMaxIDResponse();
    }

    /**
     * Create an instance of {@link AddStation }
     * 
     */
    public AddStation createAddStation() {
        return new AddStation();
    }

    /**
     * Create an instance of {@link StationMessage }
     * 
     */
    public StationMessage createStationMessage() {
        return new StationMessage();
    }

    /**
     * Create an instance of {@link GetCarrierSpeed }
     * 
     */
    public GetCarrierSpeed createGetCarrierSpeed() {
        return new GetCarrierSpeed();
    }

    /**
     * Create an instance of {@link DelCard }
     * 
     */
    public DelCard createDelCard() {
        return new DelCard();
    }

    /**
     * Create an instance of {@link ModifyStandardStepResponse }
     * 
     */
    public ModifyStandardStepResponse createModifyStandardStepResponse() {
        return new ModifyStandardStepResponse();
    }

    /**
     * Create an instance of {@link SetCarrierSleepOrWakeUp }
     * 
     */
    public SetCarrierSleepOrWakeUp createSetCarrierSleepOrWakeUp() {
        return new SetCarrierSleepOrWakeUp();
    }

    /**
     * Create an instance of {@link GetCarrierResponse }
     * 
     */
    public GetCarrierResponse createGetCarrierResponse() {
        return new GetCarrierResponse();
    }

    /**
     * Create an instance of {@link AGVName }
     * 
     */
    public AGVName createAGVName() {
        return new AGVName();
    }

    /**
     * Create an instance of {@link AddChargeParkListResponse }
     * 
     */
    public AddChargeParkListResponse createAddChargeParkListResponse() {
        return new AddChargeParkListResponse();
    }

    /**
     * Create an instance of {@link ModifyFactoryResponse }
     * 
     */
    public ModifyFactoryResponse createModifyFactoryResponse() {
        return new ModifyFactoryResponse();
    }

    /**
     * Create an instance of {@link GetClusterColumnCount }
     * 
     */
    public GetClusterColumnCount createGetClusterColumnCount() {
        return new GetClusterColumnCount();
    }

    /**
     * Create an instance of {@link GetAllCompanyResponse }
     * 
     */
    public GetAllCompanyResponse createGetAllCompanyResponse() {
        return new GetAllCompanyResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCompany }
     * 
     */
    public ArrayOfCompany createArrayOfCompany() {
        return new ArrayOfCompany();
    }

    /**
     * Create an instance of {@link DelAllFactoryInCaompany }
     * 
     */
    public DelAllFactoryInCaompany createDelAllFactoryInCaompany() {
        return new DelAllFactoryInCaompany();
    }

    /**
     * Create an instance of {@link GetStandardOrderArrayResponse }
     * 
     */
    public GetStandardOrderArrayResponse createGetStandardOrderArrayResponse() {
        return new GetStandardOrderArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAGVOrderMessage }
     * 
     */
    public ArrayOfAGVOrderMessage createArrayOfAGVOrderMessage() {
        return new ArrayOfAGVOrderMessage();
    }

    /**
     * Create an instance of {@link ModifyStandardOrderResponse }
     * 
     */
    public ModifyStandardOrderResponse createModifyStandardOrderResponse() {
        return new ModifyStandardOrderResponse();
    }

    /**
     * Create an instance of {@link ModifyStaticOp }
     * 
     */
    public ModifyStaticOp createModifyStaticOp() {
        return new ModifyStaticOp();
    }

    /**
     * Create an instance of {@link StaticOperationParemeters }
     * 
     */
    public StaticOperationParemeters createStaticOperationParemeters() {
        return new StaticOperationParemeters();
    }

    /**
     * Create an instance of {@link DelSystemLevelEquipment }
     * 
     */
    public DelSystemLevelEquipment createDelSystemLevelEquipment() {
        return new DelSystemLevelEquipment();
    }

    /**
     * Create an instance of {@link AddStep }
     * 
     */
    public AddStep createAddStep() {
        return new AddStep();
    }

    /**
     * Create an instance of {@link AGVStepMessage }
     * 
     */
    public AGVStepMessage createAGVStepMessage() {
        return new AGVStepMessage();
    }

    /**
     * Create an instance of {@link ModifyStandardOrder }
     * 
     */
    public ModifyStandardOrder createModifyStandardOrder() {
        return new ModifyStandardOrder();
    }

    /**
     * Create an instance of {@link AddFactory }
     * 
     */
    public AddFactory createAddFactory() {
        return new AddFactory();
    }

    /**
     * Create an instance of {@link Factory }
     * 
     */
    public Factory createFactory() {
        return new Factory();
    }

    /**
     * Create an instance of {@link DelWorkArea }
     * 
     */
    public DelWorkArea createDelWorkArea() {
        return new DelWorkArea();
    }

    /**
     * Create an instance of {@link DelStandardStepResponse }
     * 
     */
    public DelStandardStepResponse createDelStandardStepResponse() {
        return new DelStandardStepResponse();
    }

    /**
     * Create an instance of {@link DelEquipmentResponse }
     * 
     */
    public DelEquipmentResponse createDelEquipmentResponse() {
        return new DelEquipmentResponse();
    }

    /**
     * Create an instance of {@link DelOrderResponse }
     * 
     */
    public DelOrderResponse createDelOrderResponse() {
        return new DelOrderResponse();
    }

    /**
     * Create an instance of {@link ModifySystemControl }
     * 
     */
    public ModifySystemControl createModifySystemControl() {
        return new ModifySystemControl();
    }

    /**
     * Create an instance of {@link ModifyIOSwitchResponse }
     * 
     */
    public ModifyIOSwitchResponse createModifyIOSwitchResponse() {
        return new ModifyIOSwitchResponse();
    }

    /**
     * Create an instance of {@link GetAllUserArray }
     * 
     */
    public GetAllUserArray createGetAllUserArray() {
        return new GetAllUserArray();
    }

    /**
     * Create an instance of {@link GetCarrierStatusArray }
     * 
     */
    public GetCarrierStatusArray createGetCarrierStatusArray() {
        return new GetCarrierStatusArray();
    }

    /**
     * Create an instance of {@link DelStandardStep }
     * 
     */
    public DelStandardStep createDelStandardStep() {
        return new DelStandardStep();
    }

    /**
     * Create an instance of {@link GetStandardOrderArray }
     * 
     */
    public GetStandardOrderArray createGetStandardOrderArray() {
        return new GetStandardOrderArray();
    }

    /**
     * Create an instance of {@link GetClusterArrayResponse }
     * 
     */
    public GetClusterArrayResponse createGetClusterArrayResponse() {
        return new GetClusterArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfClusterMessage }
     * 
     */
    public ArrayOfClusterMessage createArrayOfClusterMessage() {
        return new ArrayOfClusterMessage();
    }

    /**
     * Create an instance of {@link GetCardArray }
     * 
     */
    public GetCardArray createGetCardArray() {
        return new GetCardArray();
    }

    /**
     * Create an instance of {@link FindUserByNameResponse }
     * 
     */
    public FindUserByNameResponse createFindUserByNameResponse() {
        return new FindUserByNameResponse();
    }

    /**
     * Create an instance of {@link GetIOSwitchArray }
     * 
     */
    public GetIOSwitchArray createGetIOSwitchArray() {
        return new GetIOSwitchArray();
    }

    /**
     * Create an instance of {@link GetChargeParkResponse }
     * 
     */
    public GetChargeParkResponse createGetChargeParkResponse() {
        return new GetChargeParkResponse();
    }

    /**
     * Create an instance of {@link ChargeParkMessage }
     * 
     */
    public ChargeParkMessage createChargeParkMessage() {
        return new ChargeParkMessage();
    }

    /**
     * Create an instance of {@link GetAllWorkArea }
     * 
     */
    public GetAllWorkArea createGetAllWorkArea() {
        return new GetAllWorkArea();
    }

    /**
     * Create an instance of {@link SetCarrierSpeedResponse }
     * 
     */
    public SetCarrierSpeedResponse createSetCarrierSpeedResponse() {
        return new SetCarrierSpeedResponse();
    }

    /**
     * Create an instance of {@link DelStepResponse }
     * 
     */
    public DelStepResponse createDelStepResponse() {
        return new DelStepResponse();
    }

    /**
     * Create an instance of {@link GetWorkAreaByEquipmentIDAndTypeResponse }
     * 
     */
    public GetWorkAreaByEquipmentIDAndTypeResponse createGetWorkAreaByEquipmentIDAndTypeResponse() {
        return new GetWorkAreaByEquipmentIDAndTypeResponse();
    }

    /**
     * Create an instance of {@link GetStaticOpArrayResponse }
     * 
     */
    public GetStaticOpArrayResponse createGetStaticOpArrayResponse() {
        return new GetStaticOpArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStaticOperationParemeters }
     * 
     */
    public ArrayOfStaticOperationParemeters createArrayOfStaticOperationParemeters() {
        return new ArrayOfStaticOperationParemeters();
    }

    /**
     * Create an instance of {@link ModifyChargeParkResponse }
     * 
     */
    public ModifyChargeParkResponse createModifyChargeParkResponse() {
        return new ModifyChargeParkResponse();
    }

    /**
     * Create an instance of {@link AddCompanyResponse }
     * 
     */
    public AddCompanyResponse createAddCompanyResponse() {
        return new AddCompanyResponse();
    }

    /**
     * Create an instance of {@link DelWorkAreaResponse }
     * 
     */
    public DelWorkAreaResponse createDelWorkAreaResponse() {
        return new DelWorkAreaResponse();
    }

    /**
     * Create an instance of {@link GetIOSwitchArrayResponse }
     * 
     */
    public GetIOSwitchArrayResponse createGetIOSwitchArrayResponse() {
        return new GetIOSwitchArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIOSwitchData }
     * 
     */
    public ArrayOfIOSwitchData createArrayOfIOSwitchData() {
        return new ArrayOfIOSwitchData();
    }

    /**
     * Create an instance of {@link GetOrderArrayResponse }
     * 
     */
    public GetOrderArrayResponse createGetOrderArrayResponse() {
        return new GetOrderArrayResponse();
    }

    /**
     * Create an instance of {@link AddSystemControl }
     * 
     */
    public AddSystemControl createAddSystemControl() {
        return new AddSystemControl();
    }

    /**
     * Create an instance of {@link SetCarrierSleepOrWakeUpResponse }
     * 
     */
    public SetCarrierSleepOrWakeUpResponse createSetCarrierSleepOrWakeUpResponse() {
        return new SetCarrierSleepOrWakeUpResponse();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaAGVStatusArrayResponse }
     * 
     */
    public GetAllWorkAreaAGVStatusArrayResponse createGetAllWorkAreaAGVStatusArrayResponse() {
        return new GetAllWorkAreaAGVStatusArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAGVStatusMessage }
     * 
     */
    public ArrayOfAGVStatusMessage createArrayOfAGVStatusMessage() {
        return new ArrayOfAGVStatusMessage();
    }

    /**
     * Create an instance of {@link GetStation }
     * 
     */
    public GetStation createGetStation() {
        return new GetStation();
    }

    /**
     * Create an instance of {@link ModifyPathDirection }
     * 
     */
    public ModifyPathDirection createModifyPathDirection() {
        return new ModifyPathDirection();
    }

    /**
     * Create an instance of {@link PathDirectionMessage }
     * 
     */
    public PathDirectionMessage createPathDirectionMessage() {
        return new PathDirectionMessage();
    }

    /**
     * Create an instance of {@link DelIOSwitchResponse }
     * 
     */
    public DelIOSwitchResponse createDelIOSwitchResponse() {
        return new DelIOSwitchResponse();
    }

    /**
     * Create an instance of {@link ModifyChargePark }
     * 
     */
    public ModifyChargePark createModifyChargePark() {
        return new ModifyChargePark();
    }

    /**
     * Create an instance of {@link DelSystemControlResponse }
     * 
     */
    public DelSystemControlResponse createDelSystemControlResponse() {
        return new DelSystemControlResponse();
    }

    /**
     * Create an instance of {@link DelStandardOrderResponse }
     * 
     */
    public DelStandardOrderResponse createDelStandardOrderResponse() {
        return new DelStandardOrderResponse();
    }

    /**
     * Create an instance of {@link SetCarrierPersonOperationDataResponse }
     * 
     */
    public SetCarrierPersonOperationDataResponse createSetCarrierPersonOperationDataResponse() {
        return new SetCarrierPersonOperationDataResponse();
    }

    /**
     * Create an instance of {@link GetStationArray }
     * 
     */
    public GetStationArray createGetStationArray() {
        return new GetStationArray();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaInFactory }
     * 
     */
    public GetAllWorkAreaInFactory createGetAllWorkAreaInFactory() {
        return new GetAllWorkAreaInFactory();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaResponse }
     * 
     */
    public GetAllWorkAreaResponse createGetAllWorkAreaResponse() {
        return new GetAllWorkAreaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWorkAreaName }
     * 
     */
    public ArrayOfWorkAreaName createArrayOfWorkAreaName() {
        return new ArrayOfWorkAreaName();
    }

    /**
     * Create an instance of {@link AddCluster }
     * 
     */
    public AddCluster createAddCluster() {
        return new AddCluster();
    }

    /**
     * Create an instance of {@link ClusterMessage }
     * 
     */
    public ClusterMessage createClusterMessage() {
        return new ClusterMessage();
    }

    /**
     * Create an instance of {@link GetIOSwitchResponse }
     * 
     */
    public GetIOSwitchResponse createGetIOSwitchResponse() {
        return new GetIOSwitchResponse();
    }

    /**
     * Create an instance of {@link IOSwitchData }
     * 
     */
    public IOSwitchData createIOSwitchData() {
        return new IOSwitchData();
    }

    /**
     * Create an instance of {@link GetWorkAreaByEquipmentIDAndType }
     * 
     */
    public GetWorkAreaByEquipmentIDAndType createGetWorkAreaByEquipmentIDAndType() {
        return new GetWorkAreaByEquipmentIDAndType();
    }

    /**
     * Create an instance of {@link DelChargePark }
     * 
     */
    public DelChargePark createDelChargePark() {
        return new DelChargePark();
    }

    /**
     * Create an instance of {@link GetbControlCarriersResponse }
     * 
     */
    public GetbControlCarriersResponse createGetbControlCarriersResponse() {
        return new GetbControlCarriersResponse();
    }

    /**
     * Create an instance of {@link AddStaticOpResponse }
     * 
     */
    public AddStaticOpResponse createAddStaticOpResponse() {
        return new AddStaticOpResponse();
    }

    /**
     * Create an instance of {@link AddSystemLevelEquipmentResponse }
     * 
     */
    public AddSystemLevelEquipmentResponse createAddSystemLevelEquipmentResponse() {
        return new AddSystemLevelEquipmentResponse();
    }

    /**
     * Create an instance of {@link GetStartMode }
     * 
     */
    public GetStartMode createGetStartMode() {
        return new GetStartMode();
    }

    /**
     * Create an instance of {@link GetStaticOpResponse }
     * 
     */
    public GetStaticOpResponse createGetStaticOpResponse() {
        return new GetStaticOpResponse();
    }

    /**
     * Create an instance of {@link GetPathDirectionArray }
     * 
     */
    public GetPathDirectionArray createGetPathDirectionArray() {
        return new GetPathDirectionArray();
    }

    /**
     * Create an instance of {@link GetCardArrayResponse }
     * 
     */
    public GetCardArrayResponse createGetCardArrayResponse() {
        return new GetCardArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIOCardData }
     * 
     */
    public ArrayOfIOCardData createArrayOfIOCardData() {
        return new ArrayOfIOCardData();
    }

    /**
     * Create an instance of {@link DelStep }
     * 
     */
    public DelStep createDelStep() {
        return new DelStep();
    }

    /**
     * Create an instance of {@link GetStandardStepArrayResponse }
     * 
     */
    public GetStandardStepArrayResponse createGetStandardStepArrayResponse() {
        return new GetStandardStepArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAGVStepMessage }
     * 
     */
    public ArrayOfAGVStepMessage createArrayOfAGVStepMessage() {
        return new ArrayOfAGVStepMessage();
    }

    /**
     * Create an instance of {@link GetOrderArray }
     * 
     */
    public GetOrderArray createGetOrderArray() {
        return new GetOrderArray();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaStationChargeParkArray }
     * 
     */
    public GetAllWorkAreaStationChargeParkArray createGetAllWorkAreaStationChargeParkArray() {
        return new GetAllWorkAreaStationChargeParkArray();
    }

    /**
     * Create an instance of {@link GetStandardStepArray }
     * 
     */
    public GetStandardStepArray createGetStandardStepArray() {
        return new GetStandardStepArray();
    }

    /**
     * Create an instance of {@link GetbControlCarriers }
     * 
     */
    public GetbControlCarriers createGetbControlCarriers() {
        return new GetbControlCarriers();
    }

    /**
     * Create an instance of {@link GetFactoryResponse }
     * 
     */
    public GetFactoryResponse createGetFactoryResponse() {
        return new GetFactoryResponse();
    }

    /**
     * Create an instance of {@link ModifyChargeParkByStationIDResponse }
     * 
     */
    public ModifyChargeParkByStationIDResponse createModifyChargeParkByStationIDResponse() {
        return new ModifyChargeParkByStationIDResponse();
    }

    /**
     * Create an instance of {@link GetStandardOrderColumnCountResponse }
     * 
     */
    public GetStandardOrderColumnCountResponse createGetStandardOrderColumnCountResponse() {
        return new GetStandardOrderColumnCountResponse();
    }

    /**
     * Create an instance of {@link GetAllFactoryInCompanyResponse }
     * 
     */
    public GetAllFactoryInCompanyResponse createGetAllFactoryInCompanyResponse() {
        return new GetAllFactoryInCompanyResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFactory }
     * 
     */
    public ArrayOfFactory createArrayOfFactory() {
        return new ArrayOfFactory();
    }

    /**
     * Create an instance of {@link ModifyStaticOpResponse }
     * 
     */
    public ModifyStaticOpResponse createModifyStaticOpResponse() {
        return new ModifyStaticOpResponse();
    }

    /**
     * Create an instance of {@link ModifyStartMode }
     * 
     */
    public ModifyStartMode createModifyStartMode() {
        return new ModifyStartMode();
    }

    /**
     * Create an instance of {@link AddRegisterCarrierResponse }
     * 
     */
    public AddRegisterCarrierResponse createAddRegisterCarrierResponse() {
        return new AddRegisterCarrierResponse();
    }

    /**
     * Create an instance of {@link AddOrderResponse }
     * 
     */
    public AddOrderResponse createAddOrderResponse() {
        return new AddOrderResponse();
    }

    /**
     * Create an instance of {@link ModifyChargeParkByStationID }
     * 
     */
    public ModifyChargeParkByStationID createModifyChargeParkByStationID() {
        return new ModifyChargeParkByStationID();
    }

    /**
     * Create an instance of {@link GetAllUserArrayResponse }
     * 
     */
    public GetAllUserArrayResponse createGetAllUserArrayResponse() {
        return new GetAllUserArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserData }
     * 
     */
    public ArrayOfUserData createArrayOfUserData() {
        return new ArrayOfUserData();
    }

    /**
     * Create an instance of {@link GetChargePark }
     * 
     */
    public GetChargePark createGetChargePark() {
        return new GetChargePark();
    }

    /**
     * Create an instance of {@link AddFactoryResponse }
     * 
     */
    public AddFactoryResponse createAddFactoryResponse() {
        return new AddFactoryResponse();
    }

    /**
     * Create an instance of {@link DelCompanyResponse }
     * 
     */
    public DelCompanyResponse createDelCompanyResponse() {
        return new DelCompanyResponse();
    }

    /**
     * Create an instance of {@link AddPathDirection }
     * 
     */
    public AddPathDirection createAddPathDirection() {
        return new AddPathDirection();
    }

    /**
     * Create an instance of {@link GetEquipmentArrayResponse }
     * 
     */
    public GetEquipmentArrayResponse createGetEquipmentArrayResponse() {
        return new GetEquipmentArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEquipmentData }
     * 
     */
    public ArrayOfEquipmentData createArrayOfEquipmentData() {
        return new ArrayOfEquipmentData();
    }

    /**
     * Create an instance of {@link GetStandardOrderResponse }
     * 
     */
    public GetStandardOrderResponse createGetStandardOrderResponse() {
        return new GetStandardOrderResponse();
    }

    /**
     * Create an instance of {@link DelStaticOp }
     * 
     */
    public DelStaticOp createDelStaticOp() {
        return new DelStaticOp();
    }

    /**
     * Create an instance of {@link ModifyWorkArea }
     * 
     */
    public ModifyWorkArea createModifyWorkArea() {
        return new ModifyWorkArea();
    }

    /**
     * Create an instance of {@link SetStationArrayResponse }
     * 
     */
    public SetStationArrayResponse createSetStationArrayResponse() {
        return new SetStationArrayResponse();
    }

    /**
     * Create an instance of {@link GetCompanyResponse }
     * 
     */
    public GetCompanyResponse createGetCompanyResponse() {
        return new GetCompanyResponse();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link GetCarrierArray }
     * 
     */
    public GetCarrierArray createGetCarrierArray() {
        return new GetCarrierArray();
    }

    /**
     * Create an instance of {@link ModifyCluster }
     * 
     */
    public ModifyCluster createModifyCluster() {
        return new ModifyCluster();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaAGVStatusArray }
     * 
     */
    public GetAllWorkAreaAGVStatusArray createGetAllWorkAreaAGVStatusArray() {
        return new GetAllWorkAreaAGVStatusArray();
    }

    /**
     * Create an instance of {@link AddEquipmentResponse }
     * 
     */
    public AddEquipmentResponse createAddEquipmentResponse() {
        return new AddEquipmentResponse();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaOrderArrayResponse }
     * 
     */
    public GetAllWorkAreaOrderArrayResponse createGetAllWorkAreaOrderArrayResponse() {
        return new GetAllWorkAreaOrderArrayResponse();
    }

    /**
     * Create an instance of {@link AddStandardStep }
     * 
     */
    public AddStandardStep createAddStandardStep() {
        return new AddStandardStep();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaEquipmentArrayResponse }
     * 
     */
    public GetAllWorkAreaEquipmentArrayResponse createGetAllWorkAreaEquipmentArrayResponse() {
        return new GetAllWorkAreaEquipmentArrayResponse();
    }

    /**
     * Create an instance of {@link FindUserByName }
     * 
     */
    public FindUserByName createFindUserByName() {
        return new FindUserByName();
    }

    /**
     * Create an instance of {@link ModifyWorkAreaResponse }
     * 
     */
    public ModifyWorkAreaResponse createModifyWorkAreaResponse() {
        return new ModifyWorkAreaResponse();
    }

    /**
     * Create an instance of {@link ModifyIOSwitch }
     * 
     */
    public ModifyIOSwitch createModifyIOSwitch() {
        return new ModifyIOSwitch();
    }

    /**
     * Create an instance of {@link GetCompany }
     * 
     */
    public GetCompany createGetCompany() {
        return new GetCompany();
    }

    /**
     * Create an instance of {@link DelSystemControl }
     * 
     */
    public DelSystemControl createDelSystemControl() {
        return new DelSystemControl();
    }

    /**
     * Create an instance of {@link GetCardResponse }
     * 
     */
    public GetCardResponse createGetCardResponse() {
        return new GetCardResponse();
    }

    /**
     * Create an instance of {@link IOCardData }
     * 
     */
    public IOCardData createIOCardData() {
        return new IOCardData();
    }

    /**
     * Create an instance of {@link SetStationArray }
     * 
     */
    public SetStationArray createSetStationArray() {
        return new SetStationArray();
    }

    /**
     * Create an instance of {@link ArrayOfStationMessage }
     * 
     */
    public ArrayOfStationMessage createArrayOfStationMessage() {
        return new ArrayOfStationMessage();
    }

    /**
     * Create an instance of {@link AddIOSwitchResponse }
     * 
     */
    public AddIOSwitchResponse createAddIOSwitchResponse() {
        return new AddIOSwitchResponse();
    }

    /**
     * Create an instance of {@link ModifyCompany }
     * 
     */
    public ModifyCompany createModifyCompany() {
        return new ModifyCompany();
    }

    /**
     * Create an instance of {@link GetEquipmentArray }
     * 
     */
    public GetEquipmentArray createGetEquipmentArray() {
        return new GetEquipmentArray();
    }

    /**
     * Create an instance of {@link DelCluster }
     * 
     */
    public DelCluster createDelCluster() {
        return new DelCluster();
    }

    /**
     * Create an instance of {@link DelFactory }
     * 
     */
    public DelFactory createDelFactory() {
        return new DelFactory();
    }

    /**
     * Create an instance of {@link AddCardResponse }
     * 
     */
    public AddCardResponse createAddCardResponse() {
        return new AddCardResponse();
    }

    /**
     * Create an instance of {@link GetIOSwitch }
     * 
     */
    public GetIOSwitch createGetIOSwitch() {
        return new GetIOSwitch();
    }

    /**
     * Create an instance of {@link AddChargeParkResponse }
     * 
     */
    public AddChargeParkResponse createAddChargeParkResponse() {
        return new AddChargeParkResponse();
    }

    /**
     * Create an instance of {@link DelSystemLevelEquipmentResponse }
     * 
     */
    public DelSystemLevelEquipmentResponse createDelSystemLevelEquipmentResponse() {
        return new DelSystemLevelEquipmentResponse();
    }

    /**
     * Create an instance of {@link GetPathDirectionArrayResponse }
     * 
     */
    public GetPathDirectionArrayResponse createGetPathDirectionArrayResponse() {
        return new GetPathDirectionArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPathDirectionMessage }
     * 
     */
    public ArrayOfPathDirectionMessage createArrayOfPathDirectionMessage() {
        return new ArrayOfPathDirectionMessage();
    }

    /**
     * Create an instance of {@link ModifyStation }
     * 
     */
    public ModifyStation createModifyStation() {
        return new ModifyStation();
    }

    /**
     * Create an instance of {@link SetCarrierSpeed }
     * 
     */
    public SetCarrierSpeed createSetCarrierSpeed() {
        return new SetCarrierSpeed();
    }

    /**
     * Create an instance of {@link GetOrderMaxID }
     * 
     */
    public GetOrderMaxID createGetOrderMaxID() {
        return new GetOrderMaxID();
    }

    /**
     * Create an instance of {@link DelStaticOpResponse }
     * 
     */
    public DelStaticOpResponse createDelStaticOpResponse() {
        return new DelStaticOpResponse();
    }

    /**
     * Create an instance of {@link DelFactoryResponse }
     * 
     */
    public DelFactoryResponse createDelFactoryResponse() {
        return new DelFactoryResponse();
    }

    /**
     * Create an instance of {@link AddChargePark }
     * 
     */
    public AddChargePark createAddChargePark() {
        return new AddChargePark();
    }

    /**
     * Create an instance of {@link GetCarrier }
     * 
     */
    public GetCarrier createGetCarrier() {
        return new GetCarrier();
    }

    /**
     * Create an instance of {@link GetClusterColumnCountResponse }
     * 
     */
    public GetClusterColumnCountResponse createGetClusterColumnCountResponse() {
        return new GetClusterColumnCountResponse();
    }

    /**
     * Create an instance of {@link DelRegisterCarrier }
     * 
     */
    public DelRegisterCarrier createDelRegisterCarrier() {
        return new DelRegisterCarrier();
    }

    /**
     * Create an instance of {@link WriteBlackBoxFile }
     * 
     */
    public WriteBlackBoxFile createWriteBlackBoxFile() {
        return new WriteBlackBoxFile();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaOrderArray }
     * 
     */
    public GetAllWorkAreaOrderArray createGetAllWorkAreaOrderArray() {
        return new GetAllWorkAreaOrderArray();
    }

    /**
     * Create an instance of {@link GetChargeParkListResponse }
     * 
     */
    public GetChargeParkListResponse createGetChargeParkListResponse() {
        return new GetChargeParkListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfChargeParkMessage }
     * 
     */
    public ArrayOfChargeParkMessage createArrayOfChargeParkMessage() {
        return new ArrayOfChargeParkMessage();
    }

    /**
     * Create an instance of {@link DelOrder }
     * 
     */
    public DelOrder createDelOrder() {
        return new DelOrder();
    }

    /**
     * Create an instance of {@link AddRegisterCarrier }
     * 
     */
    public AddRegisterCarrier createAddRegisterCarrier() {
        return new AddRegisterCarrier();
    }

    /**
     * Create an instance of {@link GetPasswordByNameResponse }
     * 
     */
    public GetPasswordByNameResponse createGetPasswordByNameResponse() {
        return new GetPasswordByNameResponse();
    }

    /**
     * Create an instance of {@link ModifyCarrier }
     * 
     */
    public ModifyCarrier createModifyCarrier() {
        return new ModifyCarrier();
    }

    /**
     * Create an instance of {@link AddIOSwitch }
     * 
     */
    public AddIOSwitch createAddIOSwitch() {
        return new AddIOSwitch();
    }

    /**
     * Create an instance of {@link GetChargeParkList }
     * 
     */
    public GetChargeParkList createGetChargeParkList() {
        return new GetChargeParkList();
    }

    /**
     * Create an instance of {@link SetPathDirectionArray }
     * 
     */
    public SetPathDirectionArray createSetPathDirectionArray() {
        return new SetPathDirectionArray();
    }

    /**
     * Create an instance of {@link ModifyFactory }
     * 
     */
    public ModifyFactory createModifyFactory() {
        return new ModifyFactory();
    }

    /**
     * Create an instance of {@link DelStation }
     * 
     */
    public DelStation createDelStation() {
        return new DelStation();
    }

    /**
     * Create an instance of {@link GetOrderResponse }
     * 
     */
    public GetOrderResponse createGetOrderResponse() {
        return new GetOrderResponse();
    }

    /**
     * Create an instance of {@link GetStartModeResponse }
     * 
     */
    public GetStartModeResponse createGetStartModeResponse() {
        return new GetStartModeResponse();
    }

    /**
     * Create an instance of {@link ModifyEquipment }
     * 
     */
    public ModifyEquipment createModifyEquipment() {
        return new ModifyEquipment();
    }

    /**
     * Create an instance of {@link EquipmentData }
     * 
     */
    public EquipmentData createEquipmentData() {
        return new EquipmentData();
    }

    /**
     * Create an instance of {@link GetOrder }
     * 
     */
    public GetOrder createGetOrder() {
        return new GetOrder();
    }

    /**
     * Create an instance of {@link AddStepResponse }
     * 
     */
    public AddStepResponse createAddStepResponse() {
        return new AddStepResponse();
    }

    /**
     * Create an instance of {@link DelCompany }
     * 
     */
    public DelCompany createDelCompany() {
        return new DelCompany();
    }

    /**
     * Create an instance of {@link GetAllFactoryInCompany }
     * 
     */
    public GetAllFactoryInCompany createGetAllFactoryInCompany() {
        return new GetAllFactoryInCompany();
    }

    /**
     * Create an instance of {@link AddStaticOp }
     * 
     */
    public AddStaticOp createAddStaticOp() {
        return new AddStaticOp();
    }

    /**
     * Create an instance of {@link DelUserResponse }
     * 
     */
    public DelUserResponse createDelUserResponse() {
        return new DelUserResponse();
    }

    /**
     * Create an instance of {@link GetFactory }
     * 
     */
    public GetFactory createGetFactory() {
        return new GetFactory();
    }

    /**
     * Create an instance of {@link GetRightByName }
     * 
     */
    public GetRightByName createGetRightByName() {
        return new GetRightByName();
    }

    /**
     * Create an instance of {@link GetWorkAreaResponse }
     * 
     */
    public GetWorkAreaResponse createGetWorkAreaResponse() {
        return new GetWorkAreaResponse();
    }

    /**
     * Create an instance of {@link ModifyStandardStep }
     * 
     */
    public ModifyStandardStep createModifyStandardStep() {
        return new ModifyStandardStep();
    }

    /**
     * Create an instance of {@link GetStandardOrder }
     * 
     */
    public GetStandardOrder createGetStandardOrder() {
        return new GetStandardOrder();
    }

    /**
     * Create an instance of {@link GetStandardOrderColumnCount }
     * 
     */
    public GetStandardOrderColumnCount createGetStandardOrderColumnCount() {
        return new GetStandardOrderColumnCount();
    }

    /**
     * Create an instance of {@link GetStationResponse }
     * 
     */
    public GetStationResponse createGetStationResponse() {
        return new GetStationResponse();
    }

    /**
     * Create an instance of {@link AddCompany }
     * 
     */
    public AddCompany createAddCompany() {
        return new AddCompany();
    }

    /**
     * Create an instance of {@link AddCard }
     * 
     */
    public AddCard createAddCard() {
        return new AddCard();
    }

    /**
     * Create an instance of {@link GetCarrierArrayResponse }
     * 
     */
    public GetCarrierArrayResponse createGetCarrierArrayResponse() {
        return new GetCarrierArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAGVName }
     * 
     */
    public ArrayOfAGVName createArrayOfAGVName() {
        return new ArrayOfAGVName();
    }

    /**
     * Create an instance of {@link GetStaticOp }
     * 
     */
    public GetStaticOp createGetStaticOp() {
        return new GetStaticOp();
    }

    /**
     * Create an instance of {@link DelRegisterCarrierResponse }
     * 
     */
    public DelRegisterCarrierResponse createDelRegisterCarrierResponse() {
        return new DelRegisterCarrierResponse();
    }

    /**
     * Create an instance of {@link GetEquipment }
     * 
     */
    public GetEquipment createGetEquipment() {
        return new GetEquipment();
    }

    /**
     * Create an instance of {@link GetStaticOpArray }
     * 
     */
    public GetStaticOpArray createGetStaticOpArray() {
        return new GetStaticOpArray();
    }

    /**
     * Create an instance of {@link ModifyCardResponse }
     * 
     */
    public ModifyCardResponse createModifyCardResponse() {
        return new ModifyCardResponse();
    }

    /**
     * Create an instance of {@link ModifySystemControlResponse }
     * 
     */
    public ModifySystemControlResponse createModifySystemControlResponse() {
        return new ModifySystemControlResponse();
    }

    /**
     * Create an instance of {@link DelAllFactoryInCaompanyResponse }
     * 
     */
    public DelAllFactoryInCaompanyResponse createDelAllFactoryInCaompanyResponse() {
        return new DelAllFactoryInCaompanyResponse();
    }

    /**
     * Create an instance of {@link ModifyStepResponse }
     * 
     */
    public ModifyStepResponse createModifyStepResponse() {
        return new ModifyStepResponse();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaEquipmentArray }
     * 
     */
    public GetAllWorkAreaEquipmentArray createGetAllWorkAreaEquipmentArray() {
        return new GetAllWorkAreaEquipmentArray();
    }

    /**
     * Create an instance of {@link ModifyEquipmentResponse }
     * 
     */
    public ModifyEquipmentResponse createModifyEquipmentResponse() {
        return new ModifyEquipmentResponse();
    }

    /**
     * Create an instance of {@link GetEquipmentResponse }
     * 
     */
    public GetEquipmentResponse createGetEquipmentResponse() {
        return new GetEquipmentResponse();
    }

    /**
     * Create an instance of {@link AddChargeParkList }
     * 
     */
    public AddChargeParkList createAddChargeParkList() {
        return new AddChargeParkList();
    }

    /**
     * Create an instance of {@link AddEquipment }
     * 
     */
    public AddEquipment createAddEquipment() {
        return new AddEquipment();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaInCompanyResponse }
     * 
     */
    public GetAllWorkAreaInCompanyResponse createGetAllWorkAreaInCompanyResponse() {
        return new GetAllWorkAreaInCompanyResponse();
    }

    /**
     * Create an instance of {@link AddWorkArea }
     * 
     */
    public AddWorkArea createAddWorkArea() {
        return new AddWorkArea();
    }

    /**
     * Create an instance of {@link DelStandardOrder }
     * 
     */
    public DelStandardOrder createDelStandardOrder() {
        return new DelStandardOrder();
    }

    /**
     * Create an instance of {@link SetbControlCarriers }
     * 
     */
    public SetbControlCarriers createSetbControlCarriers() {
        return new SetbControlCarriers();
    }

    /**
     * Create an instance of {@link ModifyStep }
     * 
     */
    public ModifyStep createModifyStep() {
        return new ModifyStep();
    }

    /**
     * Create an instance of {@link GetStationArrayResponse }
     * 
     */
    public GetStationArrayResponse createGetStationArrayResponse() {
        return new GetStationArrayResponse();
    }

    /**
     * Create an instance of {@link AddStandardOrder }
     * 
     */
    public AddStandardOrder createAddStandardOrder() {
        return new AddStandardOrder();
    }

    /**
     * Create an instance of {@link DelCardResponse }
     * 
     */
    public DelCardResponse createDelCardResponse() {
        return new DelCardResponse();
    }

    /**
     * Create an instance of {@link DelUser }
     * 
     */
    public DelUser createDelUser() {
        return new DelUser();
    }

    /**
     * Create an instance of {@link ModifyCompanyResponse }
     * 
     */
    public ModifyCompanyResponse createModifyCompanyResponse() {
        return new ModifyCompanyResponse();
    }

    /**
     * Create an instance of {@link GetCarrierSpeedResponse }
     * 
     */
    public GetCarrierSpeedResponse createGetCarrierSpeedResponse() {
        return new GetCarrierSpeedResponse();
    }

    /**
     * Create an instance of {@link GetCard }
     * 
     */
    public GetCard createGetCard() {
        return new GetCard();
    }

    /**
     * Create an instance of {@link AddSystemLevelEquipment }
     * 
     */
    public AddSystemLevelEquipment createAddSystemLevelEquipment() {
        return new AddSystemLevelEquipment();
    }

    /**
     * Create an instance of {@link AddSystemControlResponse }
     * 
     */
    public AddSystemControlResponse createAddSystemControlResponse() {
        return new AddSystemControlResponse();
    }

    /**
     * Create an instance of {@link GetPasswordByName }
     * 
     */
    public GetPasswordByName createGetPasswordByName() {
        return new GetPasswordByName();
    }

    /**
     * Create an instance of {@link GetWorkArea }
     * 
     */
    public GetWorkArea createGetWorkArea() {
        return new GetWorkArea();
    }

    /**
     * Create an instance of {@link DelIOSwitch }
     * 
     */
    public DelIOSwitch createDelIOSwitch() {
        return new DelIOSwitch();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaStationChargeParkArrayResponse }
     * 
     */
    public GetAllWorkAreaStationChargeParkArrayResponse createGetAllWorkAreaStationChargeParkArrayResponse() {
        return new GetAllWorkAreaStationChargeParkArrayResponse();
    }

    /**
     * Create an instance of {@link AddStandardStepResponse }
     * 
     */
    public AddStandardStepResponse createAddStandardStepResponse() {
        return new AddStandardStepResponse();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaInCompany }
     * 
     */
    public GetAllWorkAreaInCompany createGetAllWorkAreaInCompany() {
        return new GetAllWorkAreaInCompany();
    }

    /**
     * Create an instance of {@link DelEquipment }
     * 
     */
    public DelEquipment createDelEquipment() {
        return new DelEquipment();
    }

    /**
     * Create an instance of {@link GetCarrierStatusArrayResponse }
     * 
     */
    public GetCarrierStatusArrayResponse createGetCarrierStatusArrayResponse() {
        return new GetCarrierStatusArrayResponse();
    }

    /**
     * Create an instance of {@link GetClusterArray }
     * 
     */
    public GetClusterArray createGetClusterArray() {
        return new GetClusterArray();
    }

    /**
     * Create an instance of {@link ModifyStartModeResponse }
     * 
     */
    public ModifyStartModeResponse createModifyStartModeResponse() {
        return new ModifyStartModeResponse();
    }

    /**
     * Create an instance of {@link GetRightByNameResponse }
     * 
     */
    public GetRightByNameResponse createGetRightByNameResponse() {
        return new GetRightByNameResponse();
    }

    /**
     * Create an instance of {@link SetCarrierPersonOperationData }
     * 
     */
    public SetCarrierPersonOperationData createSetCarrierPersonOperationData() {
        return new SetCarrierPersonOperationData();
    }

    /**
     * Create an instance of {@link DelChargeParkResponse }
     * 
     */
    public DelChargeParkResponse createDelChargeParkResponse() {
        return new DelChargeParkResponse();
    }

    /**
     * Create an instance of {@link DelPark }
     * 
     */
    public DelPark createDelPark() {
        return new DelPark();
    }

    /**
     * Create an instance of {@link ModifyCarrierResponse }
     * 
     */
    public ModifyCarrierResponse createModifyCarrierResponse() {
        return new ModifyCarrierResponse();
    }

    /**
     * Create an instance of {@link GetAllWorkAreaInFactoryResponse }
     * 
     */
    public GetAllWorkAreaInFactoryResponse createGetAllWorkAreaInFactoryResponse() {
        return new GetAllWorkAreaInFactoryResponse();
    }

    /**
     * Create an instance of {@link ModifyCard }
     * 
     */
    public ModifyCard createModifyCard() {
        return new ModifyCard();
    }

    /**
     * Create an instance of {@link AddStandardOrderResponse }
     * 
     */
    public AddStandardOrderResponse createAddStandardOrderResponse() {
        return new AddStandardOrderResponse();
    }

    /**
     * Create an instance of {@link AGVStatusMessage }
     * 
     */
    public AGVStatusMessage createAGVStatusMessage() {
        return new AGVStatusMessage();
    }

    /**
     * Create an instance of {@link UserData }
     * 
     */
    public UserData createUserData() {
        return new UserData();
    }

    /**
     * Create an instance of {@link AGVType }
     * 
     */
    public AGVType createAGVType() {
        return new AGVType();
    }

    /**
     * Create an instance of {@link ArrayOfIOShowData }
     * 
     */
    public ArrayOfIOShowData createArrayOfIOShowData() {
        return new ArrayOfIOShowData();
    }

    /**
     * Create an instance of {@link ParkMessage }
     * 
     */
    public ParkMessage createParkMessage() {
        return new ParkMessage();
    }

    /**
     * Create an instance of {@link ArrayOfParkMessage }
     * 
     */
    public ArrayOfParkMessage createArrayOfParkMessage() {
        return new ArrayOfParkMessage();
    }

    /**
     * Create an instance of {@link IOShowData }
     * 
     */
    public IOShowData createIOShowData() {
        return new IOShowData();
    }

    /**
     * Create an instance of {@link ArrayOfunsignedShort }
     * 
     */
    public ArrayOfunsignedShort createArrayOfunsignedShort() {
        return new ArrayOfunsignedShort();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOSwitchData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "IOSwitchData")
    public JAXBElement<IOSwitchData> createIOSwitchData(IOSwitchData value) {
        return new JAXBElement<IOSwitchData>(_IOSwitchData_QNAME, IOSwitchData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ParkMessage")
    public JAXBElement<ParkMessage> createParkMessage(ParkMessage value) {
        return new JAXBElement<ParkMessage>(_ParkMessage_QNAME, ParkMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIOShowData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfIOShowData")
    public JAXBElement<ArrayOfIOShowData> createArrayOfIOShowData(ArrayOfIOShowData value) {
        return new JAXBElement<ArrayOfIOShowData>(_ArrayOfIOShowData_QNAME, ArrayOfIOShowData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathDirectionMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "PathDirectionMessage")
    public JAXBElement<PathDirectionMessage> createPathDirectionMessage(PathDirectionMessage value) {
        return new JAXBElement<PathDirectionMessage>(_PathDirectionMessage_QNAME, PathDirectionMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "EquipmentData")
    public JAXBElement<EquipmentData> createEquipmentData(EquipmentData value) {
        return new JAXBElement<EquipmentData>(_EquipmentData_QNAME, EquipmentData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Company }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "Company")
    public JAXBElement<Company> createCompany(Company value) {
        return new JAXBElement<Company>(_Company_QNAME, Company.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClusterMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfClusterMessage")
    public JAXBElement<ArrayOfClusterMessage> createArrayOfClusterMessage(ArrayOfClusterMessage value) {
        return new JAXBElement<ArrayOfClusterMessage>(_ArrayOfClusterMessage_QNAME, ArrayOfClusterMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStaticOperationParemeters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfStaticOperationParemeters")
    public JAXBElement<ArrayOfStaticOperationParemeters> createArrayOfStaticOperationParemeters(ArrayOfStaticOperationParemeters value) {
        return new JAXBElement<ArrayOfStaticOperationParemeters>(_ArrayOfStaticOperationParemeters_QNAME, ArrayOfStaticOperationParemeters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedShort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfunsignedShort")
    public JAXBElement<ArrayOfunsignedShort> createArrayOfunsignedShort(ArrayOfunsignedShort value) {
        return new JAXBElement<ArrayOfunsignedShort>(_ArrayOfunsignedShort_QNAME, ArrayOfunsignedShort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIOCardData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfIOCardData")
    public JAXBElement<ArrayOfIOCardData> createArrayOfIOCardData(ArrayOfIOCardData value) {
        return new JAXBElement<ArrayOfIOCardData>(_ArrayOfIOCardData_QNAME, ArrayOfIOCardData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfCompany")
    public JAXBElement<ArrayOfCompany> createArrayOfCompany(ArrayOfCompany value) {
        return new JAXBElement<ArrayOfCompany>(_ArrayOfCompany_QNAME, ArrayOfCompany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClusterMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ClusterMessage")
    public JAXBElement<ClusterMessage> createClusterMessage(ClusterMessage value) {
        return new JAXBElement<ClusterMessage>(_ClusterMessage_QNAME, ClusterMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOShowData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "IOShowData")
    public JAXBElement<IOShowData> createIOShowData(IOShowData value) {
        return new JAXBElement<IOShowData>(_IOShowData_QNAME, IOShowData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfUserData")
    public JAXBElement<ArrayOfUserData> createArrayOfUserData(ArrayOfUserData value) {
        return new JAXBElement<ArrayOfUserData>(_ArrayOfUserData_QNAME, ArrayOfUserData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargeParkMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ChargeParkMessage")
    public JAXBElement<ChargeParkMessage> createChargeParkMessage(ChargeParkMessage value) {
        return new JAXBElement<ChargeParkMessage>(_ChargeParkMessage_QNAME, ChargeParkMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "StationMessage")
    public JAXBElement<StationMessage> createStationMessage(StationMessage value) {
        return new JAXBElement<StationMessage>(_StationMessage_QNAME, StationMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfWorkAreaName")
    public JAXBElement<ArrayOfWorkAreaName> createArrayOfWorkAreaName(ArrayOfWorkAreaName value) {
        return new JAXBElement<ArrayOfWorkAreaName>(_ArrayOfWorkAreaName_QNAME, ArrayOfWorkAreaName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAGVStatusMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfAGVStatusMessage")
    public JAXBElement<ArrayOfAGVStatusMessage> createArrayOfAGVStatusMessage(ArrayOfAGVStatusMessage value) {
        return new JAXBElement<ArrayOfAGVStatusMessage>(_ArrayOfAGVStatusMessage_QNAME, ArrayOfAGVStatusMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaticOperationParemeters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "StaticOperationParemeters")
    public JAXBElement<StaticOperationParemeters> createStaticOperationParemeters(StaticOperationParemeters value) {
        return new JAXBElement<StaticOperationParemeters>(_StaticOperationParemeters_QNAME, StaticOperationParemeters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "WorkAreaName")
    public JAXBElement<WorkAreaName> createWorkAreaName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_WorkAreaName_QNAME, WorkAreaName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAGVName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfAGVName")
    public JAXBElement<ArrayOfAGVName> createArrayOfAGVName(ArrayOfAGVName value) {
        return new JAXBElement<ArrayOfAGVName>(_ArrayOfAGVName_QNAME, ArrayOfAGVName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfEquipmentData")
    public JAXBElement<ArrayOfEquipmentData> createArrayOfEquipmentData(ArrayOfEquipmentData value) {
        return new JAXBElement<ArrayOfEquipmentData>(_ArrayOfEquipmentData_QNAME, ArrayOfEquipmentData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVStatusMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "AGVStatusMessage")
    public JAXBElement<AGVStatusMessage> createAGVStatusMessage(AGVStatusMessage value) {
        return new JAXBElement<AGVStatusMessage>(_AGVStatusMessage_QNAME, AGVStatusMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "UserData")
    public JAXBElement<UserData> createUserData(UserData value) {
        return new JAXBElement<UserData>(_UserData_QNAME, UserData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOCardData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "IOCardData")
    public JAXBElement<IOCardData> createIOCardData(IOCardData value) {
        return new JAXBElement<IOCardData>(_IOCardData_QNAME, IOCardData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPathDirectionMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfPathDirectionMessage")
    public JAXBElement<ArrayOfPathDirectionMessage> createArrayOfPathDirectionMessage(ArrayOfPathDirectionMessage value) {
        return new JAXBElement<ArrayOfPathDirectionMessage>(_ArrayOfPathDirectionMessage_QNAME, ArrayOfPathDirectionMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAGVStepMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfAGVStepMessage")
    public JAXBElement<ArrayOfAGVStepMessage> createArrayOfAGVStepMessage(ArrayOfAGVStepMessage value) {
        return new JAXBElement<ArrayOfAGVStepMessage>(_ArrayOfAGVStepMessage_QNAME, ArrayOfAGVStepMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "AGVType")
    public JAXBElement<AGVType> createAGVType(AGVType value) {
        return new JAXBElement<AGVType>(_AGVType_QNAME, AGVType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "Factory")
    public JAXBElement<Factory> createFactory(Factory value) {
        return new JAXBElement<Factory>(_Factory_QNAME, Factory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAGVOrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfAGVOrderMessage")
    public JAXBElement<ArrayOfAGVOrderMessage> createArrayOfAGVOrderMessage(ArrayOfAGVOrderMessage value) {
        return new JAXBElement<ArrayOfAGVOrderMessage>(_ArrayOfAGVOrderMessage_QNAME, ArrayOfAGVOrderMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParkMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfParkMessage")
    public JAXBElement<ArrayOfParkMessage> createArrayOfParkMessage(ArrayOfParkMessage value) {
        return new JAXBElement<ArrayOfParkMessage>(_ArrayOfParkMessage_QNAME, ArrayOfParkMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfStationMessage")
    public JAXBElement<ArrayOfStationMessage> createArrayOfStationMessage(ArrayOfStationMessage value) {
        return new JAXBElement<ArrayOfStationMessage>(_ArrayOfStationMessage_QNAME, ArrayOfStationMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfChargeParkMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfChargeParkMessage")
    public JAXBElement<ArrayOfChargeParkMessage> createArrayOfChargeParkMessage(ArrayOfChargeParkMessage value) {
        return new JAXBElement<ArrayOfChargeParkMessage>(_ArrayOfChargeParkMessage_QNAME, ArrayOfChargeParkMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfFactory")
    public JAXBElement<ArrayOfFactory> createArrayOfFactory(ArrayOfFactory value) {
        return new JAXBElement<ArrayOfFactory>(_ArrayOfFactory_QNAME, ArrayOfFactory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "AGVName")
    public JAXBElement<AGVName> createAGVName(AGVName value) {
        return new JAXBElement<AGVName>(_AGVName_QNAME, AGVName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIOSwitchData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "ArrayOfIOSwitchData")
    public JAXBElement<ArrayOfIOSwitchData> createArrayOfIOSwitchData(ArrayOfIOSwitchData value) {
        return new JAXBElement<ArrayOfIOSwitchData>(_ArrayOfIOSwitchData_QNAME, ArrayOfIOSwitchData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVStepMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "AGVStepMessage")
    public JAXBElement<AGVStepMessage> createAGVStepMessage(AGVStepMessage value) {
        return new JAXBElement<AGVStepMessage>(_AGVStepMessage_QNAME, AGVStepMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVOrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", name = "AGVOrderMessage")
    public JAXBElement<AGVOrderMessage> createAGVOrderMessage(AGVOrderMessage value) {
        return new JAXBElement<AGVOrderMessage>(_AGVOrderMessage_QNAME, AGVOrderMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Company }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCompanyResult", scope = GetCompanyResponse.class)
    public JAXBElement<Company> createGetCompanyResponseGetCompanyResult(Company value) {
        return new JAXBElement<Company>(_GetCompanyResponseGetCompanyResult_QNAME, Company.class, GetCompanyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllCompanyResult", scope = GetAllCompanyResponse.class)
    public JAXBElement<ArrayOfCompany> createGetAllCompanyResponseGetAllCompanyResult(ArrayOfCompany value) {
        return new JAXBElement<ArrayOfCompany>(_GetAllCompanyResponseGetAllCompanyResult_QNAME, ArrayOfCompany.class, GetAllCompanyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyStartMode.class)
    public JAXBElement<WorkAreaName> createModifyStartModeName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyStartMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetEquipment.class)
    public JAXBElement<WorkAreaName> createGetEquipmentName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = SetPathDirectionArray.class)
    public JAXBElement<WorkAreaName> createSetPathDirectionArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, SetPathDirectionArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPathDirectionMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PathDirectionArray", scope = SetPathDirectionArray.class)
    public JAXBElement<ArrayOfPathDirectionMessage> createSetPathDirectionArrayPathDirectionArray(ArrayOfPathDirectionMessage value) {
        return new JAXBElement<ArrayOfPathDirectionMessage>(_SetPathDirectionArrayPathDirectionArray_QNAME, ArrayOfPathDirectionMessage.class, SetPathDirectionArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetStandardOrder.class)
    public JAXBElement<WorkAreaName> createGetStandardOrderName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetStandardOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEquipmentResult", scope = GetEquipmentResponse.class)
    public JAXBElement<EquipmentData> createGetEquipmentResponseGetEquipmentResult(EquipmentData value) {
        return new JAXBElement<EquipmentData>(_GetEquipmentResponseGetEquipmentResult_QNAME, EquipmentData.class, GetEquipmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Station", scope = ModifyStation.class)
    public JAXBElement<StationMessage> createModifyStationStation(StationMessage value) {
        return new JAXBElement<StationMessage>(_ModifyStationStation_QNAME, StationMessage.class, ModifyStation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyStation.class)
    public JAXBElement<WorkAreaName> createModifyStationName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyStation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVOrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetOrderResult", scope = GetOrderResponse.class)
    public JAXBElement<AGVOrderMessage> createGetOrderResponseGetOrderResult(AGVOrderMessage value) {
        return new JAXBElement<AGVOrderMessage>(_GetOrderResponseGetOrderResult_QNAME, AGVOrderMessage.class, GetOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllUserArrayResult", scope = GetAllUserArrayResponse.class)
    public JAXBElement<ArrayOfUserData> createGetAllUserArrayResponseGetAllUserArrayResult(ArrayOfUserData value) {
        return new JAXBElement<ArrayOfUserData>(_GetAllUserArrayResponseGetAllUserArrayResult_QNAME, ArrayOfUserData.class, GetAllUserArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAGVName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCarrierArrayResult", scope = GetCarrierArrayResponse.class)
    public JAXBElement<ArrayOfAGVName> createGetCarrierArrayResponseGetCarrierArrayResult(ArrayOfAGVName value) {
        return new JAXBElement<ArrayOfAGVName>(_GetCarrierArrayResponseGetCarrierArrayResult_QNAME, ArrayOfAGVName.class, GetCarrierArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Equipment", scope = AddEquipment.class)
    public JAXBElement<EquipmentData> createAddEquipmentEquipment(EquipmentData value) {
        return new JAXBElement<EquipmentData>(_AddEquipmentEquipment_QNAME, EquipmentData.class, AddEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddEquipment.class)
    public JAXBElement<WorkAreaName> createAddEquipmentName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStationArrayResult", scope = GetStationArrayResponse.class)
    public JAXBElement<ArrayOfStationMessage> createGetStationArrayResponseGetStationArrayResult(ArrayOfStationMessage value) {
        return new JAXBElement<ArrayOfStationMessage>(_GetStationArrayResponseGetStationArrayResult_QNAME, ArrayOfStationMessage.class, GetStationArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVOrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderMessage", scope = AddStandardOrder.class)
    public JAXBElement<AGVOrderMessage> createAddStandardOrderOrderMessage(AGVOrderMessage value) {
        return new JAXBElement<AGVOrderMessage>(_AddStandardOrderOrderMessage_QNAME, AGVOrderMessage.class, AddStandardOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelEquipment.class)
    public JAXBElement<WorkAreaName> createDelEquipmentName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = SetCarrierPersonOperationData.class)
    public JAXBElement<WorkAreaName> createSetCarrierPersonOperationDataName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, SetCarrierPersonOperationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStationResult", scope = GetStationResponse.class)
    public JAXBElement<StationMessage> createGetStationResponseGetStationResult(StationMessage value) {
        return new JAXBElement<StationMessage>(_GetStationResponseGetStationResult_QNAME, StationMessage.class, GetStationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = SetbControlCarriers.class)
    public JAXBElement<WorkAreaName> createSetbControlCarriersName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, SetbControlCarriers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = GetRightByName.class)
    public JAXBElement<String> createGetRightByNameUserName(String value) {
        return new JAXBElement<String>(_GetRightByNameUserName_QNAME, String.class, GetRightByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetRightByName.class)
    public JAXBElement<WorkAreaName> createGetRightByNameName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetRightByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Company }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyCompany.class)
    public JAXBElement<Company> createModifyCompanyName(Company value) {
        return new JAXBElement<Company>(_ModifyStartModeName_QNAME, Company.class, ModifyCompany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetStation.class)
    public JAXBElement<WorkAreaName> createGetStationName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetStation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SysVersion", scope = AddSystemControl.class)
    public JAXBElement<String> createAddSystemControlSysVersion(String value) {
        return new JAXBElement<String>(_AddSystemControlSysVersion_QNAME, String.class, AddSystemControl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddCard.class)
    public JAXBElement<WorkAreaName> createAddCardName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOCardData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Card", scope = AddCard.class)
    public JAXBElement<IOCardData> createAddCardCard(IOCardData value) {
        return new JAXBElement<IOCardData>(_AddCardCard_QNAME, IOCardData.class, AddCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathDirectionMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PathMessage", scope = ModifyPathDirection.class)
    public JAXBElement<PathDirectionMessage> createModifyPathDirectionPathMessage(PathDirectionMessage value) {
        return new JAXBElement<PathDirectionMessage>(_ModifyPathDirectionPathMessage_QNAME, PathDirectionMessage.class, ModifyPathDirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyPathDirection.class)
    public JAXBElement<WorkAreaName> createModifyPathDirectionName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyPathDirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelStandardStep.class)
    public JAXBElement<WorkAreaName> createDelStandardStepName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelStandardStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVStepMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AGVStep", scope = DelStandardStep.class)
    public JAXBElement<AGVStepMessage> createDelStandardStepAGVStep(AGVStepMessage value) {
        return new JAXBElement<AGVStepMessage>(_DelStandardStepAGVStep_QNAME, AGVStepMessage.class, DelStandardStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddRegisterCarrier.class)
    public JAXBElement<AGVName> createAddRegisterCarrierName(AGVName value) {
        return new JAXBElement<AGVName>(_ModifyStartModeName_QNAME, AGVName.class, AddRegisterCarrier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetWorkAreaByEquipmentIDAndTypeResult", scope = GetWorkAreaByEquipmentIDAndTypeResponse.class)
    public JAXBElement<WorkAreaName> createGetWorkAreaByEquipmentIDAndTypeResponseGetWorkAreaByEquipmentIDAndTypeResult(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_GetWorkAreaByEquipmentIDAndTypeResponseGetWorkAreaByEquipmentIDAndTypeResult_QNAME, WorkAreaName.class, GetWorkAreaByEquipmentIDAndTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelUser.class)
    public JAXBElement<WorkAreaName> createDelUserName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfChargeParkMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetChargeParkListResult", scope = GetChargeParkListResponse.class)
    public JAXBElement<ArrayOfChargeParkMessage> createGetChargeParkListResponseGetChargeParkListResult(ArrayOfChargeParkMessage value) {
        return new JAXBElement<ArrayOfChargeParkMessage>(_GetChargeParkListResponseGetChargeParkListResult_QNAME, ArrayOfChargeParkMessage.class, GetChargeParkListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetCarrierStatusArray.class)
    public JAXBElement<WorkAreaName> createGetCarrierStatusArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetCarrierStatusArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAGVStatusMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllWorkAreaAGVStatusArrayResult", scope = GetAllWorkAreaAGVStatusArrayResponse.class)
    public JAXBElement<ArrayOfAGVStatusMessage> createGetAllWorkAreaAGVStatusArrayResponseGetAllWorkAreaAGVStatusArrayResult(ArrayOfAGVStatusMessage value) {
        return new JAXBElement<ArrayOfAGVStatusMessage>(_GetAllWorkAreaAGVStatusArrayResponseGetAllWorkAreaAGVStatusArrayResult_QNAME, ArrayOfAGVStatusMessage.class, GetAllWorkAreaAGVStatusArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddSystemLevelEquipment.class)
    public JAXBElement<WorkAreaName> createAddSystemLevelEquipmentName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddSystemLevelEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAGVStatusMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCarrierStatusArrayResult", scope = GetCarrierStatusArrayResponse.class)
    public JAXBElement<ArrayOfAGVStatusMessage> createGetCarrierStatusArrayResponseGetCarrierStatusArrayResult(ArrayOfAGVStatusMessage value) {
        return new JAXBElement<ArrayOfAGVStatusMessage>(_GetCarrierStatusArrayResponseGetCarrierStatusArrayResult_QNAME, ArrayOfAGVStatusMessage.class, GetCarrierStatusArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetPathDirectionArray.class)
    public JAXBElement<WorkAreaName> createGetPathDirectionArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetPathDirectionArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddWorkArea.class)
    public JAXBElement<WorkAreaName> createAddWorkAreaName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddWorkArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetStaticOp.class)
    public JAXBElement<WorkAreaName> createGetStaticOpName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetStaticOp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetCarrierSpeed.class)
    public JAXBElement<WorkAreaName> createGetCarrierSpeedName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetCarrierSpeed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetStandardOrderArray.class)
    public JAXBElement<WorkAreaName> createGetStandardOrderArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetStandardOrderArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyWorkArea.class)
    public JAXBElement<WorkAreaName> createModifyWorkAreaName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyWorkArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIOCardData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCardArrayResult", scope = GetCardArrayResponse.class)
    public JAXBElement<ArrayOfIOCardData> createGetCardArrayResponseGetCardArrayResult(ArrayOfIOCardData value) {
        return new JAXBElement<ArrayOfIOCardData>(_GetCardArrayResponseGetCardArrayResult_QNAME, ArrayOfIOCardData.class, GetCardArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelChargePark.class)
    public JAXBElement<WorkAreaName> createDelChargeParkName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelChargePark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelPathDirection.class)
    public JAXBElement<WorkAreaName> createDelPathDirectionName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelPathDirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfChargeParkMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "chargeParkList", scope = AddChargeParkList.class)
    public JAXBElement<ArrayOfChargeParkMessage> createAddChargeParkListChargeParkList(ArrayOfChargeParkMessage value) {
        return new JAXBElement<ArrayOfChargeParkMessage>(_AddChargeParkListChargeParkList_QNAME, ArrayOfChargeParkMessage.class, AddChargeParkList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddChargeParkList.class)
    public JAXBElement<WorkAreaName> createAddChargeParkListName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddChargeParkList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddIOSwitch.class)
    public JAXBElement<WorkAreaName> createAddIOSwitchName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddIOSwitch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOSwitchData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "VirtualIO", scope = AddIOSwitch.class)
    public JAXBElement<IOSwitchData> createAddIOSwitchVirtualIO(IOSwitchData value) {
        return new JAXBElement<IOSwitchData>(_AddIOSwitchVirtualIO_QNAME, IOSwitchData.class, AddIOSwitch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargeParkMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "chargeParkList", scope = AddChargePark.class)
    public JAXBElement<ChargeParkMessage> createAddChargeParkChargeParkList(ChargeParkMessage value) {
        return new JAXBElement<ChargeParkMessage>(_AddChargeParkListChargeParkList_QNAME, ChargeParkMessage.class, AddChargePark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddChargePark.class)
    public JAXBElement<WorkAreaName> createAddChargeParkName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddChargePark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyCard.class)
    public JAXBElement<WorkAreaName> createModifyCardName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOCardData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Card", scope = ModifyCard.class)
    public JAXBElement<IOCardData> createModifyCardCard(IOCardData value) {
        return new JAXBElement<IOCardData>(_AddCardCard_QNAME, IOCardData.class, ModifyCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIOSwitchData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetIOSwitchArrayResult", scope = GetIOSwitchArrayResponse.class)
    public JAXBElement<ArrayOfIOSwitchData> createGetIOSwitchArrayResponseGetIOSwitchArrayResult(ArrayOfIOSwitchData value) {
        return new JAXBElement<ArrayOfIOSwitchData>(_GetIOSwitchArrayResponseGetIOSwitchArrayResult_QNAME, ArrayOfIOSwitchData.class, GetIOSwitchArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelOrder.class)
    public JAXBElement<WorkAreaName> createDelOrderName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyStandardStep.class)
    public JAXBElement<WorkAreaName> createModifyStandardStepName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyStandardStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVStepMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AGVStep", scope = ModifyStandardStep.class)
    public JAXBElement<AGVStepMessage> createModifyStandardStepAGVStep(AGVStepMessage value) {
        return new JAXBElement<AGVStepMessage>(_DelStandardStepAGVStep_QNAME, AGVStepMessage.class, ModifyStandardStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelPark.class)
    public JAXBElement<WorkAreaName> createDelParkName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelPark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllWorkAreaResult", scope = GetAllWorkAreaResponse.class)
    public JAXBElement<ArrayOfWorkAreaName> createGetAllWorkAreaResponseGetAllWorkAreaResult(ArrayOfWorkAreaName value) {
        return new JAXBElement<ArrayOfWorkAreaName>(_GetAllWorkAreaResponseGetAllWorkAreaResult_QNAME, ArrayOfWorkAreaName.class, GetAllWorkAreaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllWorkAreaEquipmentArrayResult", scope = GetAllWorkAreaEquipmentArrayResponse.class)
    public JAXBElement<ArrayOfEquipmentData> createGetAllWorkAreaEquipmentArrayResponseGetAllWorkAreaEquipmentArrayResult(ArrayOfEquipmentData value) {
        return new JAXBElement<ArrayOfEquipmentData>(_GetAllWorkAreaEquipmentArrayResponseGetAllWorkAreaEquipmentArrayResult_QNAME, ArrayOfEquipmentData.class, GetAllWorkAreaEquipmentArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SysVersion", scope = ModifySystemControl.class)
    public JAXBElement<String> createModifySystemControlSysVersion(String value) {
        return new JAXBElement<String>(_AddSystemControlSysVersion_QNAME, String.class, ModifySystemControl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Station", scope = AddStation.class)
    public JAXBElement<StationMessage> createAddStationStation(StationMessage value) {
        return new JAXBElement<StationMessage>(_ModifyStationStation_QNAME, StationMessage.class, AddStation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddStation.class)
    public JAXBElement<WorkAreaName> createAddStationName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddStation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelStaticOp.class)
    public JAXBElement<WorkAreaName> createDelStaticOpName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelStaticOp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetStandardOrderColumnCount.class)
    public JAXBElement<WorkAreaName> createGetStandardOrderColumnCountName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetStandardOrderColumnCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelStandardOrder.class)
    public JAXBElement<WorkAreaName> createDelStandardOrderName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelStandardOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetCardArray.class)
    public JAXBElement<WorkAreaName> createGetCardArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetCardArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCarrierResult", scope = GetCarrierResponse.class)
    public JAXBElement<AGVName> createGetCarrierResponseGetCarrierResult(AGVName value) {
        return new JAXBElement<AGVName>(_GetCarrierResponseGetCarrierResult_QNAME, AGVName.class, GetCarrierResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargeParkMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CurChargePark", scope = ModifyChargePark.class)
    public JAXBElement<ChargeParkMessage> createModifyChargeParkCurChargePark(ChargeParkMessage value) {
        return new JAXBElement<ChargeParkMessage>(_ModifyChargeParkCurChargePark_QNAME, ChargeParkMessage.class, ModifyChargePark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyChargePark.class)
    public JAXBElement<WorkAreaName> createModifyChargeParkName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyChargePark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddFactory.class)
    public JAXBElement<Factory> createAddFactoryName(Factory value) {
        return new JAXBElement<Factory>(_ModifyStartModeName_QNAME, Factory.class, AddFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargeParkMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetChargeParkResult", scope = GetChargeParkResponse.class)
    public JAXBElement<ChargeParkMessage> createGetChargeParkResponseGetChargeParkResult(ChargeParkMessage value) {
        return new JAXBElement<ChargeParkMessage>(_GetChargeParkResponseGetChargeParkResult_QNAME, ChargeParkMessage.class, GetChargeParkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelStation.class)
    public JAXBElement<WorkAreaName> createDelStationName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelStation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllWorkAreaInCompanyResult", scope = GetAllWorkAreaInCompanyResponse.class)
    public JAXBElement<ArrayOfWorkAreaName> createGetAllWorkAreaInCompanyResponseGetAllWorkAreaInCompanyResult(ArrayOfWorkAreaName value) {
        return new JAXBElement<ArrayOfWorkAreaName>(_GetAllWorkAreaInCompanyResponseGetAllWorkAreaInCompanyResult_QNAME, ArrayOfWorkAreaName.class, GetAllWorkAreaInCompanyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVOrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStandardOrderResult", scope = GetStandardOrderResponse.class)
    public JAXBElement<AGVOrderMessage> createGetStandardOrderResponseGetStandardOrderResult(AGVOrderMessage value) {
        return new JAXBElement<AGVOrderMessage>(_GetStandardOrderResponseGetStandardOrderResult_QNAME, AGVOrderMessage.class, GetStandardOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = FindUserByName.class)
    public JAXBElement<String> createFindUserByNameUserName(String value) {
        return new JAXBElement<String>(_GetRightByNameUserName_QNAME, String.class, FindUserByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = FindUserByName.class)
    public JAXBElement<WorkAreaName> createFindUserByNameName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, FindUserByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = SetCarrierSleepOrWakeUp.class)
    public JAXBElement<WorkAreaName> createSetCarrierSleepOrWakeUpName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, SetCarrierSleepOrWakeUp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Company }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddCompany.class)
    public JAXBElement<Company> createAddCompanyName(Company value) {
        return new JAXBElement<Company>(_ModifyStartModeName_QNAME, Company.class, AddCompany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClusterMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Cluster", scope = AddCluster.class)
    public JAXBElement<ClusterMessage> createAddClusterCluster(ClusterMessage value) {
        return new JAXBElement<ClusterMessage>(_AddClusterCluster_QNAME, ClusterMessage.class, AddCluster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddCluster.class)
    public JAXBElement<WorkAreaName> createAddClusterName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddCluster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StationArray", scope = SetStationArray.class)
    public JAXBElement<ArrayOfStationMessage> createSetStationArrayStationArray(ArrayOfStationMessage value) {
        return new JAXBElement<ArrayOfStationMessage>(_SetStationArrayStationArray_QNAME, ArrayOfStationMessage.class, SetStationArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = SetStationArray.class)
    public JAXBElement<WorkAreaName> createSetStationArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, SetStationArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFactoryResult", scope = GetFactoryResponse.class)
    public JAXBElement<Factory> createGetFactoryResponseGetFactoryResult(Factory value) {
        return new JAXBElement<Factory>(_GetFactoryResponseGetFactoryResult_QNAME, Factory.class, GetFactoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAGVOrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStandardOrderArrayResult", scope = GetStandardOrderArrayResponse.class)
    public JAXBElement<ArrayOfAGVOrderMessage> createGetStandardOrderArrayResponseGetStandardOrderArrayResult(ArrayOfAGVOrderMessage value) {
        return new JAXBElement<ArrayOfAGVOrderMessage>(_GetStandardOrderArrayResponseGetStandardOrderArrayResult_QNAME, ArrayOfAGVOrderMessage.class, GetStandardOrderArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaticOperationParemeters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStaticOpResult", scope = GetStaticOpResponse.class)
    public JAXBElement<StaticOperationParemeters> createGetStaticOpResponseGetStaticOpResult(StaticOperationParemeters value) {
        return new JAXBElement<StaticOperationParemeters>(_GetStaticOpResponseGetStaticOpResult_QNAME, StaticOperationParemeters.class, GetStaticOpResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyStep.class)
    public JAXBElement<WorkAreaName> createModifyStepName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVStepMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AGVStep", scope = ModifyStep.class)
    public JAXBElement<AGVStepMessage> createModifyStepAGVStep(AGVStepMessage value) {
        return new JAXBElement<AGVStepMessage>(_DelStandardStepAGVStep_QNAME, AGVStepMessage.class, ModifyStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEquipmentArrayResult", scope = GetEquipmentArrayResponse.class)
    public JAXBElement<ArrayOfEquipmentData> createGetEquipmentArrayResponseGetEquipmentArrayResult(ArrayOfEquipmentData value) {
        return new JAXBElement<ArrayOfEquipmentData>(_GetEquipmentArrayResponseGetEquipmentArrayResult_QNAME, ArrayOfEquipmentData.class, GetEquipmentArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVOrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderMessage", scope = AddOrder.class)
    public JAXBElement<AGVOrderMessage> createAddOrderOrderMessage(AGVOrderMessage value) {
        return new JAXBElement<AGVOrderMessage>(_AddStandardOrderOrderMessage_QNAME, AGVOrderMessage.class, AddOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaticOperationParemeters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Par", scope = AddStaticOp.class)
    public JAXBElement<StaticOperationParemeters> createAddStaticOpPar(StaticOperationParemeters value) {
        return new JAXBElement<StaticOperationParemeters>(_AddStaticOpPar_QNAME, StaticOperationParemeters.class, AddStaticOp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddStaticOp.class)
    public JAXBElement<WorkAreaName> createAddStaticOpName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddStaticOp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAGVOrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetOrderArrayResult", scope = GetOrderArrayResponse.class)
    public JAXBElement<ArrayOfAGVOrderMessage> createGetOrderArrayResponseGetOrderArrayResult(ArrayOfAGVOrderMessage value) {
        return new JAXBElement<ArrayOfAGVOrderMessage>(_GetOrderArrayResponseGetOrderArrayResult_QNAME, ArrayOfAGVOrderMessage.class, GetOrderArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetCard.class)
    public JAXBElement<WorkAreaName> createGetCardName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetCarrierArray.class)
    public JAXBElement<WorkAreaName> createGetCarrierArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetCarrierArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelRegisterCarrier.class)
    public JAXBElement<AGVName> createDelRegisterCarrierName(AGVName value) {
        return new JAXBElement<AGVName>(_ModifyStartModeName_QNAME, AGVName.class, DelRegisterCarrier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClusterMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Cluster", scope = ModifyCluster.class)
    public JAXBElement<ClusterMessage> createModifyClusterCluster(ClusterMessage value) {
        return new JAXBElement<ClusterMessage>(_AddClusterCluster_QNAME, ClusterMessage.class, ModifyCluster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyCluster.class)
    public JAXBElement<WorkAreaName> createModifyClusterName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyCluster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strBlackBox", scope = WriteBlackBoxFile.class)
    public JAXBElement<String> createWriteBlackBoxFileStrBlackBox(String value) {
        return new JAXBElement<String>(_WriteBlackBoxFileStrBlackBox_QNAME, String.class, WriteBlackBoxFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOSwitchData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetIOSwitchResult", scope = GetIOSwitchResponse.class)
    public JAXBElement<IOSwitchData> createGetIOSwitchResponseGetIOSwitchResult(IOSwitchData value) {
        return new JAXBElement<IOSwitchData>(_GetIOSwitchResponseGetIOSwitchResult_QNAME, IOSwitchData.class, GetIOSwitchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddStep.class)
    public JAXBElement<WorkAreaName> createAddStepName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVStepMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AGVStep", scope = AddStep.class)
    public JAXBElement<AGVStepMessage> createAddStepAGVStep(AGVStepMessage value) {
        return new JAXBElement<AGVStepMessage>(_DelStandardStepAGVStep_QNAME, AGVStepMessage.class, AddStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClusterMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetClusterArrayResult", scope = GetClusterArrayResponse.class)
    public JAXBElement<ArrayOfClusterMessage> createGetClusterArrayResponseGetClusterArrayResult(ArrayOfClusterMessage value) {
        return new JAXBElement<ArrayOfClusterMessage>(_GetClusterArrayResponseGetClusterArrayResult_QNAME, ArrayOfClusterMessage.class, GetClusterArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetStartMode.class)
    public JAXBElement<WorkAreaName> createGetStartModeName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetStartMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Equipment", scope = ModifyEquipment.class)
    public JAXBElement<EquipmentData> createModifyEquipmentEquipment(EquipmentData value) {
        return new JAXBElement<EquipmentData>(_AddEquipmentEquipment_QNAME, EquipmentData.class, ModifyEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyEquipment.class)
    public JAXBElement<WorkAreaName> createModifyEquipmentName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathDirectionMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PathMessage", scope = AddPathDirection.class)
    public JAXBElement<PathDirectionMessage> createAddPathDirectionPathMessage(PathDirectionMessage value) {
        return new JAXBElement<PathDirectionMessage>(_ModifyPathDirectionPathMessage_QNAME, PathDirectionMessage.class, AddPathDirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddPathDirection.class)
    public JAXBElement<WorkAreaName> createAddPathDirectionName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddPathDirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetStaticOpArray.class)
    public JAXBElement<WorkAreaName> createGetStaticOpArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetStaticOpArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPasswordByNameResult", scope = GetPasswordByNameResponse.class)
    public JAXBElement<String> createGetPasswordByNameResponseGetPasswordByNameResult(String value) {
        return new JAXBElement<String>(_GetPasswordByNameResponseGetPasswordByNameResult_QNAME, String.class, GetPasswordByNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetIOSwitch.class)
    public JAXBElement<WorkAreaName> createGetIOSwitchName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetIOSwitch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetOrderArray.class)
    public JAXBElement<WorkAreaName> createGetOrderArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetOrderArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelCard.class)
    public JAXBElement<WorkAreaName> createDelCardName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetIOSwitchArray.class)
    public JAXBElement<WorkAreaName> createGetIOSwitchArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetIOSwitchArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = SetCarrierSpeed.class)
    public JAXBElement<WorkAreaName> createSetCarrierSpeedName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, SetCarrierSpeed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetWorkAreaResult", scope = GetWorkAreaResponse.class)
    public JAXBElement<WorkAreaName> createGetWorkAreaResponseGetWorkAreaResult(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_GetWorkAreaResponseGetWorkAreaResult_QNAME, WorkAreaName.class, GetWorkAreaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaticOperationParemeters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Par", scope = ModifyStaticOp.class)
    public JAXBElement<StaticOperationParemeters> createModifyStaticOpPar(StaticOperationParemeters value) {
        return new JAXBElement<StaticOperationParemeters>(_AddStaticOpPar_QNAME, StaticOperationParemeters.class, ModifyStaticOp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyStaticOp.class)
    public JAXBElement<WorkAreaName> createModifyStaticOpName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyStaticOp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStaticOperationParemeters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStaticOpArrayResult", scope = GetStaticOpArrayResponse.class)
    public JAXBElement<ArrayOfStaticOperationParemeters> createGetStaticOpArrayResponseGetStaticOpArrayResult(ArrayOfStaticOperationParemeters value) {
        return new JAXBElement<ArrayOfStaticOperationParemeters>(_GetStaticOpArrayResponseGetStaticOpArrayResult_QNAME, ArrayOfStaticOperationParemeters.class, GetStaticOpArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = GetPasswordByName.class)
    public JAXBElement<String> createGetPasswordByNameUserName(String value) {
        return new JAXBElement<String>(_GetRightByNameUserName_QNAME, String.class, GetPasswordByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetPasswordByName.class)
    public JAXBElement<WorkAreaName> createGetPasswordByNameName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetPasswordByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetOrderMaxID.class)
    public JAXBElement<WorkAreaName> createGetOrderMaxIDName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetOrderMaxID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetCarrier.class)
    public JAXBElement<WorkAreaName> createGetCarrierName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetCarrier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfChargeParkMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllWorkAreaStationChargeParkArrayResult", scope = GetAllWorkAreaStationChargeParkArrayResponse.class)
    public JAXBElement<ArrayOfChargeParkMessage> createGetAllWorkAreaStationChargeParkArrayResponseGetAllWorkAreaStationChargeParkArrayResult(ArrayOfChargeParkMessage value) {
        return new JAXBElement<ArrayOfChargeParkMessage>(_GetAllWorkAreaStationChargeParkArrayResponseGetAllWorkAreaStationChargeParkArrayResult_QNAME, ArrayOfChargeParkMessage.class, GetAllWorkAreaStationChargeParkArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetChargePark.class)
    public JAXBElement<WorkAreaName> createGetChargeParkName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetChargePark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyStandardOrder.class)
    public JAXBElement<WorkAreaName> createModifyStandardOrderName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyStandardOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVOrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CurOrderMessage", scope = ModifyStandardOrder.class)
    public JAXBElement<AGVOrderMessage> createModifyStandardOrderCurOrderMessage(AGVOrderMessage value) {
        return new JAXBElement<AGVOrderMessage>(_ModifyStandardOrderCurOrderMessage_QNAME, AGVOrderMessage.class, ModifyStandardOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetbControlCarriers.class)
    public JAXBElement<WorkAreaName> createGetbControlCarriersName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetbControlCarriers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetClusterArray.class)
    public JAXBElement<WorkAreaName> createGetClusterArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetClusterArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetClusterColumnCount.class)
    public JAXBElement<WorkAreaName> createGetClusterColumnCountName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetClusterColumnCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelStep.class)
    public JAXBElement<WorkAreaName> createDelStepName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVStepMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AGVStep", scope = DelStep.class)
    public JAXBElement<AGVStepMessage> createDelStepAGVStep(AGVStepMessage value) {
        return new JAXBElement<AGVStepMessage>(_DelStandardStepAGVStep_QNAME, AGVStepMessage.class, DelStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPathDirectionMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPathDirectionArrayResult", scope = GetPathDirectionArrayResponse.class)
    public JAXBElement<ArrayOfPathDirectionMessage> createGetPathDirectionArrayResponseGetPathDirectionArrayResult(ArrayOfPathDirectionMessage value) {
        return new JAXBElement<ArrayOfPathDirectionMessage>(_GetPathDirectionArrayResponseGetPathDirectionArrayResult_QNAME, ArrayOfPathDirectionMessage.class, GetPathDirectionArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyIOSwitch.class)
    public JAXBElement<WorkAreaName> createModifyIOSwitchName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyIOSwitch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOSwitchData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "VirtualIO", scope = ModifyIOSwitch.class)
    public JAXBElement<IOSwitchData> createModifyIOSwitchVirtualIO(IOSwitchData value) {
        return new JAXBElement<IOSwitchData>(_AddIOSwitchVirtualIO_QNAME, IOSwitchData.class, ModifyIOSwitch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelCluster.class)
    public JAXBElement<WorkAreaName> createDelClusterName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelCluster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAGVStepMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStandardStepArrayResult", scope = GetStandardStepArrayResponse.class)
    public JAXBElement<ArrayOfAGVStepMessage> createGetStandardStepArrayResponseGetStandardStepArrayResult(ArrayOfAGVStepMessage value) {
        return new JAXBElement<ArrayOfAGVStepMessage>(_GetStandardStepArrayResponseGetStandardStepArrayResult_QNAME, ArrayOfAGVStepMessage.class, GetStandardStepArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetEquipmentArray.class)
    public JAXBElement<WorkAreaName> createGetEquipmentArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetEquipmentArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllFactoryInCompanyResult", scope = GetAllFactoryInCompanyResponse.class)
    public JAXBElement<ArrayOfFactory> createGetAllFactoryInCompanyResponseGetAllFactoryInCompanyResult(ArrayOfFactory value) {
        return new JAXBElement<ArrayOfFactory>(_GetAllFactoryInCompanyResponseGetAllFactoryInCompanyResult_QNAME, ArrayOfFactory.class, GetAllFactoryInCompanyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddStandardStep.class)
    public JAXBElement<WorkAreaName> createAddStandardStepName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, AddStandardStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVStepMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AGVStep", scope = AddStandardStep.class)
    public JAXBElement<AGVStepMessage> createAddStandardStepAGVStep(AGVStepMessage value) {
        return new JAXBElement<AGVStepMessage>(_DelStandardStepAGVStep_QNAME, AGVStepMessage.class, AddStandardStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetOrder.class)
    public JAXBElement<WorkAreaName> createGetOrderName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetChargeParkList.class)
    public JAXBElement<WorkAreaName> createGetChargeParkListName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetChargeParkList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargeParkMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CurChargePark", scope = ModifyChargeParkByStationID.class)
    public JAXBElement<ChargeParkMessage> createModifyChargeParkByStationIDCurChargePark(ChargeParkMessage value) {
        return new JAXBElement<ChargeParkMessage>(_ModifyChargeParkCurChargePark_QNAME, ChargeParkMessage.class, ModifyChargeParkByStationID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyChargeParkByStationID.class)
    public JAXBElement<WorkAreaName> createModifyChargeParkByStationIDName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, ModifyChargeParkByStationID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetStationArray.class)
    public JAXBElement<WorkAreaName> createGetStationArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetStationArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyFactory.class)
    public JAXBElement<Factory> createModifyFactoryName(Factory value) {
        return new JAXBElement<Factory>(_ModifyStartModeName_QNAME, Factory.class, ModifyFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = DelIOSwitch.class)
    public JAXBElement<WorkAreaName> createDelIOSwitchName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, DelIOSwitch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetStandardStepArray.class)
    public JAXBElement<WorkAreaName> createGetStandardStepArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetStandardStepArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = GetAllUserArray.class)
    public JAXBElement<WorkAreaName> createGetAllUserArrayName(WorkAreaName value) {
        return new JAXBElement<WorkAreaName>(_ModifyStartModeName_QNAME, WorkAreaName.class, GetAllUserArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkAreaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllWorkAreaInFactoryResult", scope = GetAllWorkAreaInFactoryResponse.class)
    public JAXBElement<ArrayOfWorkAreaName> createGetAllWorkAreaInFactoryResponseGetAllWorkAreaInFactoryResult(ArrayOfWorkAreaName value) {
        return new JAXBElement<ArrayOfWorkAreaName>(_GetAllWorkAreaInFactoryResponseGetAllWorkAreaInFactoryResult_QNAME, ArrayOfWorkAreaName.class, GetAllWorkAreaInFactoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOCardData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCardResult", scope = GetCardResponse.class)
    public JAXBElement<IOCardData> createGetCardResponseGetCardResult(IOCardData value) {
        return new JAXBElement<IOCardData>(_GetCardResponseGetCardResult_QNAME, IOCardData.class, GetCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGVName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = ModifyCarrier.class)
    public JAXBElement<AGVName> createModifyCarrierName(AGVName value) {
        return new JAXBElement<AGVName>(_ModifyStartModeName_QNAME, AGVName.class, ModifyCarrier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAGVOrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllWorkAreaOrderArrayResult", scope = GetAllWorkAreaOrderArrayResponse.class)
    public JAXBElement<ArrayOfAGVOrderMessage> createGetAllWorkAreaOrderArrayResponseGetAllWorkAreaOrderArrayResult(ArrayOfAGVOrderMessage value) {
        return new JAXBElement<ArrayOfAGVOrderMessage>(_GetAllWorkAreaOrderArrayResponseGetAllWorkAreaOrderArrayResult_QNAME, ArrayOfAGVOrderMessage.class, GetAllWorkAreaOrderArrayResponse.class, value);
    }

}
