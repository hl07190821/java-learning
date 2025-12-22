package interfacetest.inherit;

import interfacetest.implementstest.USB;

/**
 * ClassName: UsbC
 * Package: interfacetest.inherit
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 13:15
 * @Version 1.0
 */
public interface UsbC extends Chargeable , USB {
    void reverse();
}