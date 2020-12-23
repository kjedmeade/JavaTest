package wf.contacts.controller;

import static org.hamcrest.Matchers.startsWith;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ContactServiceTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getRoot() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(startsWith("<html><body>")));
    }
    
    @Test
    public void getContacts() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/contact").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(startsWith("[{\"firstName\":\"Sean\"")));

    }
    
    @Test
    public void getContactsSortDesc() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/contact").queryParam("sort", "DESC").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(startsWith("[{\"firstName\":\"Tom\"")));

    }
    
    @Test
    public void getContactsFilter() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/contact").queryParam("lastName", "Barr").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(startsWith("[{\"firstName\":\"David\"")));

    }
}
