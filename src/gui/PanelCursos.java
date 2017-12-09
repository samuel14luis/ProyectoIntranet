/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import complementos.CheckBoxCurso;
import complementos.Colores;
import complementos.NotasCurso;
import complementos.jpaneInfoCurso;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Alisoft
 */
public class PanelCursos extends javax.swing.JPanel {

    public boolean disponible = true;
    private final JPanel active;
    private final PrincipalGUI principal;
    ArrayList<CheckBoxCurso> cursos;

    /**
     * Creates new form PanelCursos
     *
     * @param active
     * @param principal
     */
    public PanelCursos(JPanel active, PrincipalGUI principal) {
        initComponents();
        this.active = active;
        this.principal = principal;
        cursos = new ArrayList<>();
        cargarCursos();
        Thread hilo = new Thread(() -> {
            generarGraficos();
            agregarInfoCursos();
            jlblPonderadoAcumulado.setText("" + calcularPonderado());
        });
        hilo.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jpaneCheckBox = new javax.swing.JPanel();
        jspPuestosAula = new javax.swing.JScrollPane();
        jpanePruebas = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jspInfoCursos = new javax.swing.JScrollPane();
        jpaneInfoCursos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblPonderadoAcumulado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblCreditos = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(233, 235, 238));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(null);

        jpaneCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        jpaneCheckBox.setLayout(new javax.swing.BoxLayout(jpaneCheckBox, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane2.setViewportView(jpaneCheckBox);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jpanePruebasLayout = new javax.swing.GroupLayout(jpanePruebas);
        jpanePruebas.setLayout(jpanePruebasLayout);
        jpanePruebasLayout.setHorizontalGroup(
            jpanePruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        jpanePruebasLayout.setVerticalGroup(
            jpanePruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        jspPuestosAula.setViewportView(jpanePruebas);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jspInfoCursos.setBackground(new java.awt.Color(255, 255, 255));
        jspInfoCursos.setBorder(null);
        jspInfoCursos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspInfoCursos.setMaximumSize(new java.awt.Dimension(228, 269));
        jspInfoCursos.setPreferredSize(new java.awt.Dimension(228, 269));

        jpaneInfoCursos.setBackground(new java.awt.Color(255, 255, 255));
        jpaneInfoCursos.setMaximumSize(new java.awt.Dimension(228, 269));
        jpaneInfoCursos.setLayout(new javax.swing.BoxLayout(jpaneInfoCursos, javax.swing.BoxLayout.PAGE_AXIS));
        jspInfoCursos.setViewportView(jpaneInfoCursos);

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Promedio Ponderado Acumulado:");

        jlblPonderadoAcumulado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlblPonderadoAcumulado.setForeground(new java.awt.Color(255, 255, 255));
        jlblPonderadoAcumulado.setText("15.2");

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Créditos: ");

        jlblCreditos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlblCreditos.setForeground(new java.awt.Color(255, 255, 255));
        jlblCreditos.setText("24");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblPonderadoAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlblPonderadoAcumulado)
                    .addComponent(jLabel2)
                    .addComponent(jlblCreditos))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jspInfoCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jspInfoCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        /*jspInfoCursos.setBounds(10, 35, 250, 525);
        jspInfoCursos.setBackground(new Color(1, 0, 0, 0));
        jspInfoCursos.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        jspInfoCursos.getViewport().setBorder(null);
        jspInfoCursos.setViewportBorder(null);
        jspInfoCursos.setBorder(null);*/

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jspPuestosAula)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jspPuestosAula))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlblCreditos;
    private javax.swing.JLabel jlblPonderadoAcumulado;
    private javax.swing.JPanel jpaneCheckBox;
    private javax.swing.JPanel jpaneInfoCursos;
    private javax.swing.JPanel jpanePruebas;
    private javax.swing.JScrollPane jspInfoCursos;
    private javax.swing.JScrollPane jspPuestosAula;
    // End of variables declaration//GEN-END:variables

    private void generarGraficos() {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        XYSeriesCollection dataset = new XYSeriesCollection();
        Iterator<CheckBoxCurso> iterador = cursos.iterator();

        XYSeries curso_line;
        int it = 0;

        while (iterador.hasNext()) {
            CheckBoxCurso cbc = iterador.next();
            NotasCurso curso = cbc.curso;
            if (cbc.checkbox.isSelected()) {
                curso_line = new XYSeries(curso.getNombre());

                if (curso.getPromedioDeModulo1() != null) {
                    curso_line.add(1, curso.getPromedioDeModulo1());
                }
                if (curso.getPromedioDeModulo2() != null) {
                    curso_line.add(2, curso.getPromedioDeModulo2());
                }
                if (curso.getPromedioDeModulo3() != null) {
                    curso_line.add(3, curso.getPromedioDeModulo3());
                }
                if (curso.getPromedioDeModulo4() != null) {
                    curso_line.add(4, curso.getPromedioDeModulo4());
                }
                dataset.addSeries(curso_line);
                renderer.setSeriesPaint(it, cbc.color_curso);
                renderer.setSeriesStroke(it, new BasicStroke(4.0f));
                it++;
            }
        }
        //agregamos gráfica de nota máxima y mínima y módulo de 1 a 4
        curso_line = new XYSeries("-");
        curso_line.add(1, 0);
        curso_line.add(4, 20);
        dataset.addSeries(curso_line);
        renderer.setSeriesPaint(it, new Color(255, 200, 0, 0));

        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                "Evolución de tus notas",
                "Módulo",
                "Puntuación",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        XYPlot plot = xylineChart.getXYPlot();
        plot.setRenderer(renderer);

        ChartPanel panel = new ChartPanel(xylineChart);
        jScrollPane1.setViewportView(panel);
    }

    private void cargarCursos() {

        addCurso(
                "Taller de Desarrollo de Software I", "FARRO PACÍFICO Edwin Iván", 4d, Colores.getColorAt(0),
                19.4, 19.2, 19.0,
                18.4, 18.2, 20.0,
                19.4, 19.2, 19.4,
                19.4, 18.2, 18.4,
                0
        );
        addCurso(
                "Taller de Procesamiento Distribuido", "GALLARDO ANDRÉS Jhonar Ángel", 4d, Colores.getColorAt(1),
                15.4, 18.2, 15.4,
                15.4, 18.2, 15.4,
                15.4, 18.2, 15.4,
                15.4, 18.2, 15.4,
                0
        );
        addCurso(
                "Taller de Innovación Tecnológica", "LEÓN JULCA Manuel Antonio", 3d, Colores.getColorAt(2),
                15.4, 18.2, 15.4,
                11.4, 18.2, 11.4,
                15.4, 12.2, 15.4,
                15.4, 18.2, 15.4,
                0
        );
        addCurso(
                "Ética, Responsabilidad Social y Ambiental", "CRUZ CASTAÑEDA Carlos Manuel", 2d, Colores.getColorAt(3),
                15.4, 18.2, 18.4,
                15.4, 12.2, 15.4,
                10.4, 18.2, 15.4,
                15.4, 10.2, 17.4,
                0
        );
        addCurso(
                "Fundamentos de Sistemas de Información", "MEYHUAY FIDEL Juan Carlos", 3d, Colores.getColorAt(7),
                15.4, 10.2, 10.4,
                12.4, 12.2, 15.4,
                10.4, 14.2, 10.4,
                10.4, 18.2, 15.4,
                0
        );

        /*
        addCurso(
                "Curso 1", "sin nombre",3d, Colores.getColorAt(2), 
                10.0,10.0,12.0,
                11.0,11.0,13.0,
                11.0,11.0,12.0,
                null,null,null,
                0
                );
        addCurso(
                "Curso 2", "sin nombre",3d, Colores.getColorAt(4), 
                9.0,7.0,8.0, 
                2.0,5.0,5.0,
                6.0,10.0,9.0,
                null,null,null,
                0
                );
        addCurso(
                "Curso 3", "sin nombre",3d, Colores.getColorAt(7), 
                13.0,13.0,13.0, 
                8.0,8.0,8.0,
                10.0,10.0,10.0,
                null,null,null,
                0
                );
         */
        System.out.println("cursos cargados");
    }

    private void addCurso(String nombre, String docente, Double creditos, Color color_curso, Double ec1, Double ep1, Double ed1, Double ec2, Double ep2, Double ed2, Double ec3, Double ep3, Double ed3, Double ec4, Double ep4, Double ed4, int inasistencias) {
        NotasCurso curso = new NotasCurso(nombre, docente, creditos);
        JCheckBox checkbox = new JCheckBox();
        checkbox.setBackground(new java.awt.Color(255, 255, 255));
        checkbox.setText(curso.getNombre());
        checkbox.setSelected(true);
        checkbox.addActionListener((java.awt.event.ActionEvent evt) -> {
            generarGraficos();
        });

        //<editor-fold defaultstate="collapsed" desc="Condicionales">
        if (inasistencias <= 0) {
            curso.setInasistencias(0);
        } else {
            curso.setInasistencias(inasistencias);
        }

        if (ec1 != null) {
            curso.setEc1(ec1);
        }
        if (ep1 != null) {
            curso.setEp1(ep1);
        }
        if (ed1 != null) {
            curso.setEd1(ed1);
        }

        if (ec2 != null) {
            curso.setEc2(ec2);
        }
        if (ep2 != null) {
            curso.setEp2(ep2);
        }
        if (ed2 != null) {
            curso.setEd2(ed2);
        }

        if (ec3 != null) {
            curso.setEc3(ec3);
        }
        if (ep3 != null) {
            curso.setEp3(ep3);
        }
        if (ed3 != null) {
            curso.setEd3(ed3);
        }

        if (ec4 != null) {
            curso.setEc4(ec4);
        }
        if (ep4 != null) {
            curso.setEp4(ep4);
        }
        if (ed4 != null) {
            curso.setEd4(ed4);
        }
//</editor-fold>

        cursos.add(new CheckBoxCurso(checkbox, curso, color_curso));
        jpaneCheckBox.add(checkbox);
    }

    private void agregarCurso(NotasCurso curso, Color color_curso) {
        jpaneInfoCurso info_curso = new jpaneInfoCurso(curso, color_curso);
        Dimension d = new Dimension(479 - 15, 225);
        //Dimension d = new Dimension(jpaneInfoCursos.getWidth()-15, 269);
        info_curso.setMinimumSize(d);
        info_curso.setMaximumSize(d);
        info_curso.setPreferredSize(d);
        info_curso.setVisible(true);

        jpaneInfoCursos.add(info_curso);
        jpaneInfoCursos.updateUI();

        System.out.println("added: " + curso.getNombre());
    }

    private void agregarInfoCursos() {
        for (int i = 0; i < cursos.size(); i++) {
            agregarCurso(cursos.get(i).curso, cursos.get(i).color_curso);
        }
    }

    private Double calcularPonderado() {
        Double acumulado = 0.0;
        Double creditos = totalCreditos();
        NotasCurso curso;
        for (int i = 0; i < cursos.size(); i++) {
            curso = cursos.get(i).curso;
            acumulado += curso.getPAcumulado() * (curso.getCreditos() / creditos);
            System.out.println(curso.getNombre() + " : " + curso.getPAcumulado());
        }
        System.out.println("acmulado: " + acumulado);
        return NotasCurso.format(NotasCurso.validarNota(acumulado));
    }

    private Double totalCreditos() {
        Double creditos = 0.0;
        for (int i = 0; i < cursos.size(); i++) {
            creditos += cursos.get(i).curso.getCreditos();
        }
        jlblCreditos.setText("" + creditos);
        return creditos;
    }
}
