import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import { Icon, Label, Menu, Table } from 'semantic-ui-react'
import ProductService from "../services/productService"

export default function ProductList() {

  const [products, setProducts] = useState([])

  useEffect(()=>{
    let productService = new ProductService()
    productService.getProducts().then(result=>setProducts(result.data))
  },[]) 

  return (
    <div>
      <Table celled>
        <Table.Header>
          <Table.Row>
            <Table.HeaderCell>Number</Table.HeaderCell>
            <Table.HeaderCell>Name</Table.HeaderCell>
            <Table.HeaderCell>Price</Table.HeaderCell>

          </Table.Row>
        </Table.Header>

        <Table.Body>
          {
            products.map((product) => (
              <Table.Row key={product.id}>
                <Table.Cell>{product.id}</Table.Cell>
                <Table.Cell><Link to={`/products/${product.id}`}>{product.name}</Link></Table.Cell>
                <Table.Cell><Link to={`/products/${product.id}`}>{product.price}</Link></Table.Cell>
              </Table.Row>
            ))
          }

        </Table.Body>

        <Table.Footer>
          <Table.Row>
            <Table.HeaderCell colSpan='3'>
              <Menu floated='right' pagination>
                <Menu.Item as='a' icon>
                  <Icon name='chevron left' />
                </Menu.Item>
                <Menu.Item as='a'>1</Menu.Item>
                <Menu.Item as='a'>2</Menu.Item>
                <Menu.Item as='a'>3</Menu.Item>
                <Menu.Item as='a'>4</Menu.Item>
                <Menu.Item as='a' icon>
                  <Icon name='chevron right' />
                </Menu.Item>
              </Menu>
            </Table.HeaderCell>
          </Table.Row>
        </Table.Footer>
      </Table>
    </div>
  )
}
