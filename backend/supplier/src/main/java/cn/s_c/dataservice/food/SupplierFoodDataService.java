package cn.s_c.dataservice.food;

import cn.s_c.entity.food.SupplierFood;
import cn.s_c.vo.ResultMessage;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface SupplierFoodDataService {

    /**
     * upload the image to the cloud
     *
     * @param bytes the image data
     * @return the url of the uploaded image
     */
    String uploadImageToCloud(byte[] bytes);

    /**
     * save the supplier food to the database
     *
     * @param supplierFood the supplier food
     * @return whether the operation is success or not
     */
    ResultMessage saveSupplierFood(SupplierFood supplierFood);

    /**
     * get the supplier foods by supplier
     *
     * @param supplierId the id of the supplier
     * @return the supplier food set
     */
    Set<SupplierFood> getSupplierFoodBySupplierId(int supplierId);

    /**
     * delete the supplier food by its id
     *
     * @param foodId the id of the supplier food
     * @return whether the operation is success or not
     */
    ResultMessage deleteSupplierFood(int foodId);
}