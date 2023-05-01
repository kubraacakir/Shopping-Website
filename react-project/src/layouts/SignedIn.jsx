import React from 'react'
import { Dropdown, Menu, Image } from 'semantic-ui-react'

export default function SignedIn({signOut}) {
  return (
    <div>
        <Menu.Item>
            <Image avatar spaced = "right" src = "https://media.licdn.com/dms/image/D4D03AQFBz_GQhfxShw/profile-displayphoto-shrink_400_400/0/1669754599844?e=1688601600&v=beta&t=KTUaT7Wq5_BK6z-7QyqhGQSBJAxW1aBDtMS34xYn2zg"/>
            <Dropdown pointing = "top left" text = "Kübra">
                <Dropdown.Menu>
                    <Dropdown.Item text = "My Information" icon = "info"/>
                    <Dropdown.Item onClick={signOut} text = "Sign Out" icon = "sign-out"/>
                </Dropdown.Menu>
            </Dropdown>
        </Menu.Item>
    </div>
  )
}
