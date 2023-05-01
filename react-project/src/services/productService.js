import axios from "axios";

export default class ProductService{
    getProducts(){
        return axios.get("http://localhost:1111/api/brands/getall")
    }
    getById(id){
        return axios.get("http://localhost:1111/api/brands/getbyid/?id="+ id)
    }
}