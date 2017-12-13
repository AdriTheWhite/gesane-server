/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.rafaelaznar.bean.specificimplementation;

import com.google.gson.annotations.Expose;
import eu.rafaelaznar.bean.genericimplementation.TableGenericBeanImplementation;
import eu.rafaelaznar.bean.meta.publicinterface.MetaObjectBeanInterface;
import eu.rafaelaznar.bean.meta.publicinterface.MetaPropertyBeanInterface;
import eu.rafaelaznar.helper.EnumHelper;
import eu.rafaelaznar.helper.constant.RegexConstants;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author a0y3770325h
 */

@MetaObjectBeanInterface(
        TableName = "especialidad",
        SingularDescription = "Especialidad",
        PluralDescription = "Tabla de especialidad",
        Icon = "fa fa-stethoscope",
        Type = EnumHelper.SourceType.Table
)
public class EspecialidadSpecificBeanImplementation extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Esp.desc.",
            LongName = "Descripcion de especialidad",
            Description = "Descripcion de la tabla especialidad",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedSentence,
            // RegexHelp = RegexConstants.capitalizedSentence_Help,
            IsForeignKeyDescriptor = true
    )
    private String descripcion = "";

    public EspecialidadSpecificBeanImplementation() {
    }

    EspecialidadSpecificBeanImplementation(Integer id_especialidad) {
        id = id_especialidad;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

}