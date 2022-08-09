# 0805_HW

* 以線上商城為例：賣家可管理產品庫存及新增修改商品

##  Model
* private String name&emsp;&nbsp;//產品名稱
* private int price&emsp;&emsp;&emsp;//產品價格
* public int stock&emsp;&emsp;&emsp;//產品庫存   
* private String description &nbsp;//產品描述 

## Service
*  public List<Product> getAllProducts(){...} </br>
-> 使用 Get 取得全部產品
* public Product getProductByName(String name){...}  </br>
-> 透過產品名稱來取得產品資訊(GET)
* public Product createProduct(Product product){...}  </br>
-> 用 Post 新增新到貨的產品至網站上。(POST)
* public Product updateProduct(String name, Product product){...}  </br>
-> 被消費者選購走的產品數目需要用 Put 修改數量，或是修改產品資訊。(PUT)
* public Product deleteProduct(String name){...}  </br>
-> 當產品週期結束，需要下架產品時，用 Delete 刪除。(DELETE)
