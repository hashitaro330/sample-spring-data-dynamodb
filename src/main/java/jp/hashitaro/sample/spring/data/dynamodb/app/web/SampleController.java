package jp.hashitaro.sample.spring.data.dynamodb.app.web;

import jp.hashitaro.sample.spring.data.dynamodb.app.model.SampleModel;
import jp.hashitaro.sample.spring.data.dynamodb.app.model.SampleModelMapper;
import jp.hashitaro.sample.spring.data.dynamodb.domain.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping(method = RequestMethod.GET, value = "findAll")
    public String findAll(Model model) {
        model.addAttribute("sampleTables", sampleService.getSampleTables());
        return "findAll";
    }

    @RequestMapping(method = RequestMethod.GET, value = "findOne")
    public String findOne(SampleModel sampleModel, Model model) {
        model.addAttribute("sampleTables",
                sampleService.getSampleTable(
                        SampleModelMapper.mapToSampleTableKey(sampleModel)
                ));
        return "findOne";
    }

    @RequestMapping(method = RequestMethod.POST, value = "add")
    public String add(SampleModel sampleModel, Model model) {
        model.addAttribute("sampleTable",
                sampleService.addSampleTable(SampleModelMapper.map(sampleModel)));
        return "add";
    }

    @RequestMapping(method = RequestMethod.POST, value = "update")
    public String update(SampleModel sampleModel, Model model) {
        model.addAttribute("sampleTable",
                sampleService.updateSampleTable(SampleModelMapper.map(sampleModel)));
        return "add";
    }

    @RequestMapping(method = RequestMethod.POST, value = "delete")
    public String delete(SampleModel sampleModel, Model model) {
        model.addAttribute("sampleTable",
                sampleService.deleteSampleTable(
                        SampleModelMapper.mapToSampleTableKey(sampleModel)));
        return "delete";
    }

}
